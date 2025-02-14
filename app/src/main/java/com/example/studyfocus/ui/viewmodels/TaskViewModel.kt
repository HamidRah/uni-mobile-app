package com.example.studyfocus.ui.viewmodels

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.studyfocus.ui.data.classes.Task
import com.example.studyfocus.ui.data.repositories.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(
    private val taskRepository: TaskRepository,
) : ViewModel()  {

    val incompleteTasks: Flow<List<Task>> = taskRepository.incompleteTasks
    val completedTasks: Flow<List<Task>> = taskRepository.completedTasks


    fun addTask(task: Task) {
        viewModelScope.launch {
            taskRepository.addTask(task)
        }
    }

    fun markTaskComplete(task: Task) {
        viewModelScope.launch {
            taskRepository.markTaskAsComplete(task.id)
        }
    }

    fun deleteTask(task: Task) {
        viewModelScope.launch {
            taskRepository.deleteTask(task)
        }
    }


}