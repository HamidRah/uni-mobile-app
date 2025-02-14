package com.example.studyfocus.ui.components.calendar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
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
fun CalendarTaskItem(
    task: Task
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = task.name, fontWeight = Bold)
            Text(text = "Due Date: ${task.dueDate.formatToString()}")
            Text(text = task.description)
        }
    }
}

fun Long.formatToString(): String {
    val formatter = SimpleDateFormat("dd-MM-yyyy", Locale.UK)
    return formatter.format(Date(this))
}