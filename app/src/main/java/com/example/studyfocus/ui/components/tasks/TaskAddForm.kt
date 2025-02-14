package com.example.studyfocus.ui.components.tasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun AddTaskForm(
    onAddTask: (String, String, Long) -> Unit,
    modifier: Modifier = Modifier
) {
    var taskName by remember { mutableStateOf("") }
    var taskDescription by remember { mutableStateOf("") }
    var dueDateMillis by remember { mutableLongStateOf(System.currentTimeMillis()) }
    var isDatePickerVisible by remember { mutableStateOf(false) }

    if (isDatePickerVisible) {
        MyDatePickerDialog(
            onDateSelected = { _, dateMillis ->
                dueDateMillis = dateMillis
                isDatePickerVisible = false
            },
            onDismiss = { isDatePickerVisible = false }
        )
    }


    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.surfaceVariant)
    ) {
        OutlinedTextField(
            value = taskName,
            onValueChange = { taskName = it },
            label = { Text("Task Name") },
            singleLine = true,
            trailingIcon = {
                if (taskName.isNotEmpty()) {
                    IconButton(onClick = { taskName = "" }) {
                        Icon(Icons.Filled.Clear, contentDescription = "Clear text")
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = taskDescription,
            onValueChange = { taskDescription = it },
            label = { Text("Task Description") },
            singleLine = true,
            trailingIcon = {
                if (taskDescription.isNotEmpty()) {
                    IconButton(onClick = { taskDescription = "" }) {
                        Icon(Icons.Filled.Clear, contentDescription = "Clear text")
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { /* Open date picker dialog */ isDatePickerVisible = true },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Due Date: ${convertMillisToDate(dueDateMillis)}")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { onAddTask(taskName, taskDescription, dueDateMillis) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .height(48.dp),
            shape = RoundedCornerShape(24.dp) // Circular button
        ) {
            Text("Add")
        }
    }
}


