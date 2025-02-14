package com.example.studyfocus.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.studyfocus.ui.data.repositories.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class ReportViewModel @Inject constructor(
    taskRepository: TaskRepository
) : ViewModel() {
    val completedTaskCount = taskRepository.completedTasks.map { it.size }.asLiveData()
    val incompleteTaskCount = taskRepository.incompleteTasks.map { it.size }.asLiveData()
}