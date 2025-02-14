package com.example.studyfocus.ui.data.repositories

import com.example.studyfocus.ui.data.classes.Task
import com.example.studyfocus.ui.data.classes.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import kotlinx.coroutines.flow.Flow


class TaskRepository(private val taskDao: TaskDao) {
    val incompleteTasks: Flow<List<Task>> = taskDao.getIncompleteTasks()
    val completedTasks: Flow<List<Task>> = taskDao.getCompletedTasks()

    suspend fun addTask(task: Task) {
        taskDao.insertTask(task)
    }

    suspend fun updateTask(task: Task) {
        taskDao.updateTask(task)
    }

    suspend fun deleteTask(task: Task) {
        taskDao.deleteTask(task)
    }

    suspend fun markTaskAsComplete(taskId: Int) {
        taskDao.markTaskAsComplete(taskId)
    }

    suspend fun markTaskAsIncomplete(taskId: Int) {
        taskDao.markTaskAsIncomplete(taskId)
    }

    fun getTasksForDate(date: Long, isCompleted: Boolean): Flow<List<Task>> {
        return taskDao.getTasksForDate(date, isCompleted)
    }


}


@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {
    @Provides
    fun provideTaskRepository(taskDao: TaskDao): TaskRepository = TaskRepository(taskDao)
}