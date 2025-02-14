package com.example.studyfocus.ui.components.calendar

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.studyfocus.ui.data.classes.Task

@Composable
fun CalendarTaskList(
    tasks: List<Task>
) {
    LazyColumn {
        items(tasks) { task ->
            CalendarTaskItem(task = task)
        }
    }
}

