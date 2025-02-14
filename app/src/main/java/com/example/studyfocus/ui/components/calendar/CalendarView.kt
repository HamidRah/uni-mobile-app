package com.example.studyfocus.ui.components.calendar

import android.widget.CalendarView
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import java.util.*

@Composable
fun CalendarViewDisplay(onDateSelected: (Long) -> Unit) {
    AndroidView(
        factory = { context ->
            CalendarView(context).apply {
                setOnDateChangeListener { _, year, month, dayOfMonth ->
                    val calendar = Calendar.getInstance()
                    calendar.set(year, month, dayOfMonth)
                    onDateSelected(calendar.timeInMillis)
                }
            }
        }
    )
}
