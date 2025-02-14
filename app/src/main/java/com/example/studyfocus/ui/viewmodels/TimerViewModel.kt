package com.example.studyfocus.ui.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import com.example.studyfocus.ui.data.classes.TimerState
import com.example.studyfocus.ui.data.repositories.NotificationRepository
import com.example.studyfocus.ui.data.repositories.TaskRepository
import com.example.studyfocus.ui.data.repositories.SettingsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TimerViewModel @Inject constructor(
    private val repository: TaskRepository,
    private val settingsRepository: SettingsRepository,
    private val notificationRepository: NotificationRepository

) : ViewModel() {

    private val _focusDuration = MutableStateFlow(10 * 60) // default value in seconds
    private val _shortBreakDuration = MutableStateFlow(2 * 60) // default value in seconds
    private val _longBreakDuration = MutableStateFlow(7 * 60) // default value in seconds

    // Define the TimerLoadingState enum inside the ViewModel
    enum class TimerLoadingState { Loading, Loaded }

    private val _timerLoadingState = MutableLiveData(TimerLoadingState.Loading)
    val timerLoadingState: LiveData<TimerLoadingState> = _timerLoadingState

    private val _isRunning = MutableLiveData(false)
    val isRunning: LiveData<Boolean> = _isRunning

    init {
        viewModelScope.launch {
            combine(
                settingsRepository.getFocusDuration(),
                settingsRepository.getShortBreakDuration(),
                settingsRepository.getLongBreakDuration()
            ) { focusDuration, shortBreakDuration, longBreakDuration ->
                _focusDuration.value = focusDuration
                _shortBreakDuration.value = shortBreakDuration
                _longBreakDuration.value = longBreakDuration
            }.collect {
                _timerLoadingState.value = TimerLoadingState.Loaded
            }
        };
            _isRunning.observeForever { isRunning ->
            Log.d("TimerViewModel", "isRunning updated: $isRunning")
            }
    }

        enum class TimerMode { Focus, ShortBreak, LongBreak }

    private val _currentState = MutableLiveData(TimerState.Default)
    val currentState: LiveData<TimerState> = _currentState

    private val _timeLeft = MutableLiveData<Int>()
    val timeLeft: LiveData<Int> = _timeLeft

    val formattedTimeLeft: LiveData<String> = _timeLeft.map { time ->
        val minutes = time / 60
        val seconds = time % 60
        String.format("%02d:%02d", minutes, seconds)
    }

    private val _currentMode = MutableLiveData(TimerMode.Focus)
    val currentMode: LiveData<TimerMode> = _currentMode

    private var timerJob: Job? = null


    private var _focusSessionCount = MutableLiveData(0)
    val focusSessionCount: LiveData<Int> = _focusSessionCount

    private var focusSessionCountValue = 0  // Tracks focus sessions completed

    // Initialize or reset the timer with a specific duration
    fun initializeTimer() {
        if (_timerLoadingState.value == TimerLoadingState.Loading) {
            // Optionally handle the case when settings are still loading (e.g., show a message)
            return
        }
        viewModelScope.launch {
            val duration = when (_currentMode.value) {
                TimerMode.Focus -> _focusDuration.value
                TimerMode.ShortBreak -> _shortBreakDuration.value
                TimerMode.LongBreak -> _longBreakDuration.value
                else -> 25 * 60 // Default to 25 minutes if mode is unrecognized
            }
            _timeLeft.value = duration
            //_isRunning.postValue(false)
            //timerJob?.cancel() // Cancel any existing job
        }
    }

    // Start or resume the timer
    fun startTimer() {
        _isRunning.value = true
        _currentState.value = TimerState.Running
        timerJob = viewModelScope.launch {
            var timeLeft = _timeLeft.value ?: return@launch  // Safe call with Elvis operator
            //Log.d("TimerViewModel", "Timer started with timeLeft: $timeLeft seconds")
            while (timeLeft > 0) {
                _timeLeft.postValue(timeLeft)
                delay(1000)
<<<<<<< HEAD
                timeLeft-= 20
=======
                timeLeft--
>>>>>>> f0e249e (Fixed timer countdown)
                _timeLeft.postValue(timeLeft)
                //Log.d("TimerViewModel", "Timer decremented, timeLeft: $timeLeft seconds")

            }
            //_isRunning.postValue(false)
            if (timeLeft <= 0) {
                //Log.d("TimerViewModel", "Timer reached zero, switching mode")
                switchMode() // Call this method to switch mode
            }
        }
    }

    fun pauseTimer() {
        _currentState.value = TimerState.Paused
        timerJob?.cancel()
        _isRunning.value = true
    }

    fun resetTimer() {
        _currentState.value = TimerState.Default
        timerJob?.cancel()
        _timeLeft.value = 0
        _currentMode.value = TimerMode.Focus
        _isRunning.value = false
        focusSessionCountValue = 0
        _focusSessionCount.value = focusSessionCountValue
    }


    private fun switchMode() {
        viewModelScope.launch {
            when (_currentMode.value) {
                TimerMode.Focus -> {
                    focusSessionCountValue++
                    if (focusSessionCountValue >= 4) {
                        focusSessionCountValue = 0
                        initializeTimer()
                        _currentMode.value = TimerMode.LongBreak
                        startTimer()
                        notificationRepository.sendNotification(
                            "Timer Update",
                            "Time for a long break."
                        )
                    } else {
                        //Log.d("TimerViewModel", "Starting short break:" +
                        //        "Mode=${_currentMode.value}")
                        initializeTimer()
                        _currentMode.value = TimerMode.ShortBreak
                        startTimer()
                        notificationRepository.sendNotification(
                            "Timer Update",
                            "Starting short break."
                        )
                    }
                }
                TimerMode.ShortBreak -> {
                    initializeTimer()
                    _currentMode.value = TimerMode.Focus
                    startTimer()
                    notificationRepository.sendNotification(
                        "Timer Update",
                        "Back to focus mode."
                    )
                }
                TimerMode.LongBreak -> {
                    resetTimer()
                    notificationRepository.sendNotification(
                        "Timer Update",
                        "Long break over, back to work!"
                    )
                }
                else -> {
                    resetTimer()
                }
            }
            _focusSessionCount.value = focusSessionCountValue
        }
    }
}
// Old
//    private fun switchMode() {
//        when (_currentMode.value) {
//            TimerMode.Focus -> {
//                focusSessionCountValue++
//                if (focusSessionCountValue >= 4) {
//                    focusSessionCountValue = 0  // Reset focus session count
//                    initializeTimer() // Duration for long break (e.g., 15 minutes)
//                    _currentMode.value = TimerMode.LongBreak
//                    startTimer() // Start the long break timer
//                } else {
//                    initializeTimer() // Duration for short break (e.g., 5 minutes)
//                    _currentMode.value = TimerMode.ShortBreak
//                    startTimer() // Start the short break timer
//                }
//            }
//            TimerMode.ShortBreak -> {
//                initializeTimer() // Duration for focus (e.g., 25 minutes)
//                _currentMode.value = TimerMode.Focus
//                startTimer() // Start the focus timer
//            }
//            TimerMode.LongBreak -> {
//                resetTimer()
//            }
//
//            else -> {
//                resetTimer()
//            }
//        }
//        // Update the session count LiveData
//        _focusSessionCount.value = focusSessionCountValue
//    }
