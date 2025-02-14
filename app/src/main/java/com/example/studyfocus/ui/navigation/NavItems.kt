package com.example.studyfocus.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    val label: String,
    val icon: ImageVector,
    val route: String
)
val listOfNavItems = listOf(
    NavItems(
        label = "Timer",
        icon = Icons.Default.Home,
        route = Screens.TimerScreen.name
    ),
    NavItems(
        label = "Task",
        icon = Icons.Default.Edit,
        route = Screens.TaskScreen.name
    ),
    NavItems(
        label = "Calendar",
        icon = Icons.Default.DateRange,
        route = Screens.CalendarScreen.name
    ),
    NavItems(
        label = "Report",
        icon = Icons.Default.Info,
        route = Screens.ReportScreen.name
    ),
    NavItems(
        label = "Setting",
        icon = Icons.Default.Settings,
        route = Screens.SettingScreen.name
    )
)