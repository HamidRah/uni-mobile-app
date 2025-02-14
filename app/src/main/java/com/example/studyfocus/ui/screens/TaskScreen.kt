package com.example.studyfocus.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.studyfocus.ui.components.tasks.AddTaskForm
import com.example.studyfocus.ui.components.tasks.TaskList
import com.example.studyfocus.ui.data.classes.Task
import com.example.studyfocus.ui.viewmodels.TaskViewModel
import com.example.studyfocus.ui.viewmodels.TimerViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(taskViewModel: TaskViewModel) {
    val incompleteTasks by taskViewModel.incompleteTasks.collectAsState(initial = emptyList())
    val completedTasks by taskViewModel.completedTasks.collectAsState(initial = emptyList())


    val sheetState = rememberModalBottomSheetState()
    val coroutineScope = rememberCoroutineScope()
    var showBottomSheet by remember { mutableStateOf(false) }
    val tabs = listOf("To-Do", "Completed")
    var selectedTabIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TabRow(selectedTabIndex = selectedTabIndex) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        text = { Text(title) },
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index }
                    )
                }
            }
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text("Add Task") },
                icon = { Icon(Icons.Filled.Add, contentDescription = "Add Task") },
                onClick = {
                    showBottomSheet = true
                }
            )
        },
        floatingActionButtonPosition = FabPosition.Center,
    ) { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            when (selectedTabIndex) {
                0 -> TaskList(
                    tasks = incompleteTasks,
                    onTaskComplete = taskViewModel::markTaskComplete,
                    onDeleteTask = taskViewModel::deleteTask,
                    showCompleteButton = true

                )
                1 -> TaskList(
                    tasks = completedTasks,
                    onTaskComplete = taskViewModel::markTaskComplete,
                    onDeleteTask = taskViewModel::deleteTask,
                    showCompleteButton = false
                )
            }
        }

        if (showBottomSheet) {
            ModalBottomSheet(
                onDismissRequest = {
                    showBottomSheet = false
                },
                sheetState = sheetState
            ) {
                // Assume AddTaskForm now includes dueDate
                AddTaskForm(
                    onAddTask = { taskName, taskDescription, dueDate ->
                        val newTask = Task(
                            name = taskName,
                            description = taskDescription,
                            dueDate = dueDate // Make sure this is a Long representing milliseconds
                        )
                        taskViewModel.addTask(newTask)
                        coroutineScope.launch { sheetState.hide() }
                        showBottomSheet = false
                    }
                )
            }
        }
    }
}


