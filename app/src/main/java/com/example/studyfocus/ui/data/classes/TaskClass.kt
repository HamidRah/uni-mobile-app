package com.example.studyfocus.ui.data.classes

import android.content.Context
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Update
import com.example.studyfocus.ui.data.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow


@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val description: String,
    val dueDate: Long,
    val isComplete: Boolean = false
)

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks WHERE isComplete = 0")
    fun getIncompleteTasks(): Flow<List<Task>>

    @Query("SELECT * FROM tasks WHERE isComplete = 1")
    fun getCompletedTasks(): Flow<List<Task>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: Task): Long

    @Update
    suspend fun updateTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)

    @Query("UPDATE tasks SET isComplete = 1 WHERE id = :taskId")
    suspend fun markTaskAsComplete(taskId: Int)

    @Query("UPDATE tasks SET isComplete = 0 WHERE id = :taskId")
    suspend fun markTaskAsIncomplete(taskId: Int)

    @Query("SELECT * FROM tasks WHERE dueDate = :date AND isComplete = :isCompleted")
    fun getTasksForDate(date: Long, isCompleted: Boolean): Flow<List<Task>>
}



@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase =
        AppDatabase.getDatabase(context)

    @Provides
    fun provideTaskDao(appDatabase: AppDatabase): TaskDao = appDatabase.taskDao()
}