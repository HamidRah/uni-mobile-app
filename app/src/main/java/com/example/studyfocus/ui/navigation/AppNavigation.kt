package com.example.studyfocus.ui.navigation

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.studyfocus.ui.screens.CalendarScreen
import com.example.studyfocus.ui.screens.ReportScreen
import com.example.studyfocus.ui.screens.SettingsScreen
import com.example.studyfocus.ui.screens.TaskScreen
import com.example.studyfocus.ui.screens.TimerScreen
import com.example.studyfocus.ui.viewmodels.TaskViewModel
import com.example.studyfocus.ui.viewmodels.TimerViewModel


@Composable
fun AppNavigation(timerViewModel: TimerViewModel) {
    val navController = rememberNavController()
    val isTimerRunning by timerViewModel.isRunning.observeAsState(true)
    val context = LocalContext.current

    var showToast by remember { mutableStateOf(false) }

    // Side-effect to show toast when showToast changes
    LaunchedEffect(showToast) {
        if (showToast) {
            Toast.makeText(context, "Timer is running, navigation is disabled", Toast.LENGTH_SHORT).show()
            showToast = false // Reset state
        }
    }

    Scaffold(bottomBar = {
        // Conditionally display the NavigationBar
        if (!isTimerRunning) {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach { navItem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any { it.route == navItem.route } == true,
                        onClick = {
                            navController.navigate(navItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = { Icon(imageVector = navItem.icon, contentDescription = null) },
                        label = { Text(text = navItem.label) }
                    )
                }
            }
        }
    }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.TimerScreen.name,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = Screens.TimerScreen.name) {

                TimerScreen(viewModel = timerViewModel)
            }
            composable(route = Screens.TaskScreen.name) {
                // Inject the TaskViewModel and TimerViewModel using Hilt
                val taskViewModel: TaskViewModel = hiltViewModel()
                TaskScreen(taskViewModel = taskViewModel)
            }
            composable(route = Screens.CalendarScreen.name) {
                CalendarScreen()
            }
            composable(route = Screens.ReportScreen.name) {
                ReportScreen()
            }
            composable(route = Screens.SettingScreen.name) {
                SettingsScreen()
            }
        }
    }
}
