package com.example.studyfocus.ui.components.tasks

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import com.example.studyfocus.ui.data.classes.Task
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun TaskItem(
    task: Task,
    onTaskComplete: (Task) -> Unit,
    onDeleteTask: (Task) -> Unit,
    showCompleteButton: Boolean // Add this parameter to indicate if the task is completed

) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(text = task.name, fontWeight = Bold)
                Text(text = "Due Date: ${task.dueDate.formatToString()}") // Make sure you have this extension function defined
                Text(text = task.description)
            }
            // Only show the complete button if the task is not completed
            if (showCompleteButton) {
                IconButton(onClick = { onTaskComplete(task) }) {
                    Icon(imageVector = Icons.Default.Check, contentDescription = "Complete")
                }
            }
                IconButton(onClick = { onDeleteTask(task) }) { // Delete button
                    Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete")
                }
            }
        }
    }


fun Long.formatToString(): String {
    val formatter = SimpleDateFormat("dd-MM-yyyy", Locale.UK)
    return formatter.format(Date(this))
}
