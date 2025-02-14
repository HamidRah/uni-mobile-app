package com.example.studyfocus.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.studyfocus.ui.components.calendar.CalendarDatePickerDialog
import com.example.studyfocus.ui.components.calendar.CalendarTaskList
import com.example.studyfocus.ui.components.tasks.MyDatePickerDialog
import com.example.studyfocus.ui.viewmodels.CalendarViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalendarScreen(calendarViewModel: CalendarViewModel = hiltViewModel()) {
    val incompleteTasks by calendarViewModel.incompleteTasks.collectAsState(initial = emptyList())
    val completeTasks by calendarViewModel.completeTasks.collectAsState(initial = emptyList())

    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val tabs = listOf("Incomplete", "Complete")

    // State to control the visibility of the DatePickerDialog
    var showDatePicker by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Calendar") },
                actions = {
                    IconButton(onClick = { showDatePicker = true }) {
                        Icon(Icons.Filled.DateRange, contentDescription = "Select Date")
                    }
                }
            )
        }
    ) { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            // TabRow for switching tabs
            TabRow(selectedTabIndex = selectedTabIndex) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        text = { Text(title) },
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index }
                    )
                }
            }

            // Task list based on the selected tab
            when (selectedTabIndex) {
                0 -> CalendarTaskList(tasks = incompleteTasks)
                1 -> CalendarTaskList(tasks = completeTasks)
            }
        }

        // Show DatePickerDialog when requested
        if (showDatePicker) {
            CalendarDatePickerDialog(
                onDateSelected = { _, dateMillis ->
                    calendarViewModel.onDateSelected(dateMillis)
                    showDatePicker = false
                },
                onDismiss = { showDatePicker = false }
            )
        }
    }
}

