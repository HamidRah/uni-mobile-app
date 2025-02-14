package com.example.studyfocus.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.studyfocus.ui.data.classes.Task
import com.example.studyfocus.ui.data.repositories.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

@HiltViewModel
class CalendarViewModel @Inject constructor(
    private val taskRepository: TaskRepository
) : ViewModel() {

    private val _selectedDate = MutableStateFlow(System.currentTimeMillis())
    private val selectedDate: StateFlow<Long> = _selectedDate.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    val incompleteTasks: Flow<List<Task>> = selectedDate.flatMapLatest { date ->
        taskRepository.getTasksForDate(date, false)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    val completeTasks: Flow<List<Task>> = selectedDate.flatMapLatest { date ->
        taskRepository.getTasksForDate(date, true)
    }

    fun onDateSelected(date: Long) {
        _selectedDate.value = date
    }
}
