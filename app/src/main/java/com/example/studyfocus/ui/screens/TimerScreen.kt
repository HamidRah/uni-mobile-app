package com.example.studyfocus.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.studyfocus.ui.viewmodels.TimerViewModel
import com.example.studyfocus.ui.data.classes.TimerState


@Composable
fun TimerScreen(viewModel: TimerViewModel) {
    val formattedTime by viewModel.formattedTimeLeft.observeAsState("00:00")
    val currentMode by viewModel.currentMode.observeAsState(TimerViewModel.TimerMode.Focus)
    val timerState by viewModel.currentState.observeAsState(TimerState.Default)
    val focusSessionCount by viewModel.focusSessionCount.observeAsState(0)

    // Calculate the number of sessions remaining before the long break
    val sessionsRemaining = 4 - focusSessionCount

    val (backgroundColor, contentColor) = when (currentMode) {
        TimerViewModel.TimerMode.Focus -> MaterialTheme.colorScheme.primary to MaterialTheme.colorScheme.onPrimary
        TimerViewModel.TimerMode.ShortBreak -> MaterialTheme.colorScheme.secondary to MaterialTheme.colorScheme.onSecondary
        TimerViewModel.TimerMode.LongBreak -> MaterialTheme.colorScheme.tertiary to MaterialTheme.colorScheme.onTertiary
    }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.background(
                color = backgroundColor.copy(0.5f)
            )
        ) {

            Text(
                text = currentMode.name.replaceFirstChar { it.uppercase() }, // Capitalize the first letter
                style = MaterialTheme.typography.headlineMedium,
            )
            // Timer mode and current time display
            Text(
                text = formattedTime,
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.padding(16.dp)
            )
            // Display the number of focus sessions remaining
            Text(
                text = "$sessionsRemaining focus sessions remaining",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp)
            )

            // Buttons display based on timer state
            // Buttons display based on timer state
            when (timerState) {
                TimerState.Default, TimerState.Paused -> {
                    Button(
                        onClick = {
                            if (timerState == TimerState.Default) {
                                viewModel.initializeTimer() // This now picks the correct duration
                            }
                            viewModel.startTimer()
                        },
                        modifier = Modifier.padding(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor)
                    ) {
                        Text(text = if (timerState == TimerState.Paused) "Resume" else "Start", color = contentColor)
                    }
                }
                TimerState.Running -> {
                    Row(modifier = Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Button(
                            onClick = { viewModel.pauseTimer() },
                            colors = ButtonDefaults.buttonColors(containerColor = backgroundColor)
                        ) {
                            Text(text = "Pause", color = contentColor)
                        }
                        Button(
                            onClick = { viewModel.resetTimer() },
                            colors = ButtonDefaults.buttonColors(containerColor = backgroundColor)
                        ) {
                            Text(text = "Reset", color = contentColor)
                        }
                    }
                }
            }
        }
    }
}

