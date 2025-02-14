package com.example.studyfocus.ui.screens

import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
<<<<<<< HEAD
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
=======
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
>>>>>>> f0e249e (Fixed timer countdown)
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.studyfocus.ui.viewmodels.SettingsViewModel
import kotlinx.coroutines.launch

@Composable
fun SettingsScreen(settingsViewModel: SettingsViewModel = hiltViewModel()) {


    // Collect the flows as state in the composable
    val focusDuration by settingsViewModel.focusDurationFlow.collectAsState(initial = 25)
    val shortBreakDuration by settingsViewModel.shortBreakDurationFlow.collectAsState(initial = 5)
    val longBreakDuration by settingsViewModel.longBreakDurationFlow.collectAsState(initial = 15)
    val themeSetting by settingsViewModel.themeSettingFlow.collectAsState(initial = 2) // 2 for System Default


    // Remember a CoroutineScope tied to the SettingsScreen's lifecycle
    val coroutineScope = rememberCoroutineScope()
    LaunchedEffect(key1 = "log_settings") {
        settingsViewModel.logCurrentSettings()
    }

<<<<<<< HEAD
    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth()
        ,
        horizontalAlignment = Alignment.Start){
=======
    Column {
>>>>>>> f0e249e (Fixed timer countdown)
        NumberInputField(
            label = "Focus Duration",
            value = focusDuration,
            onValueChange = { newValue ->
                coroutineScope.launch {
                    settingsViewModel.updateFocusDuration(newValue)
                }
            }
        )
        NumberInputField(
            label = "Short Break Duration",
            value = shortBreakDuration,
            onValueChange = { newValue ->
                coroutineScope.launch {
                    settingsViewModel.updateShortBreakDuration(newValue)
                }
            }
        )
        NumberInputField(
            label = "Long Break Duration",
            value = longBreakDuration,
            onValueChange = { newValue ->
                coroutineScope.launch {
                    settingsViewModel.updateLongBreakDuration(newValue)
                }
            }
        )
<<<<<<< HEAD
        Spacer(modifier = Modifier.padding(16.dp))
=======
>>>>>>> f0e249e (Fixed timer countdown)
        ThemeSettingOption(
            themeSetting = themeSetting,
            onThemeChange = { newTheme ->
                coroutineScope.launch {
                    settingsViewModel.updateThemeSetting(newTheme)
                }
            }
        )
    }
}

@Composable
fun NumberInputField(
    label: String,
    value: Int,
    onValueChange: (Int) -> Unit
) {
    var text by remember { mutableStateOf(value.toString()) }

    // Update the text whenever the value changes
    LaunchedEffect(value) {
        text = value.toString()
    }

    OutlinedTextField(
        value = text,
        onValueChange = { newText ->
            if (newText.all { it.isDigit() } || newText.isEmpty()) {
                text = newText
                newText.toIntOrNull()?.let { onValueChange(it) }
            }
        },
        label = { Text(label) },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Done
        ),
        singleLine = true,
        textStyle = TextStyle(
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )
    )
}


@Composable
fun ThemeSettingOption(themeSetting: Int, onThemeChange: (Int) -> Unit) {
<<<<<<< HEAD
    ElevatedCard(
        modifier = Modifier.fillMaxWidth()
    ){
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Theme Setting", style = TextStyle(fontSize = 18.sp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Light")
                RadioButton(
                    selected = themeSetting == 0,
                    onClick = { onThemeChange(0) }
                )

            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Dark")
                RadioButton(
                    selected = themeSetting == 1,
                    onClick = { onThemeChange(1) }
                )

            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("System Default")
                RadioButton(
                    selected = themeSetting == 2,
                    onClick = { onThemeChange(2) }
                )

            }
        }

    }

=======
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Theme Setting", style = TextStyle(fontSize = 18.sp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = themeSetting == 0,
                onClick = { onThemeChange(0) }
            )
            Text("Light")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = themeSetting == 1,
                onClick = { onThemeChange(1) }
            )
            Text("Dark")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = themeSetting == 2,
                onClick = { onThemeChange(2) }
            )
            Text("System Default")
        }
    }
>>>>>>> f0e249e (Fixed timer countdown)
}




