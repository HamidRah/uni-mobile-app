package com.example.studyfocus.ui.components.tasks

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.studyfocus.ui.data.classes.Task
import kotlinx.coroutines.flow.Flow

@Composable
fun TaskList(
    tasks: List<Task>,
    onTaskComplete: (Task) -> Unit,
    onDeleteTask: (Task) -> Unit,
    showCompleteButton: Boolean
) {
    LazyColumn(contentPadding = PaddingValues(bottom = 76.dp))  {
        items(tasks) { task ->
            TaskItem(
                task = task,
                onTaskComplete = { onTaskComplete(task) },
                onDeleteTask = { onDeleteTask(task) },
                showCompleteButton = showCompleteButton
            )
        }
    }
}




