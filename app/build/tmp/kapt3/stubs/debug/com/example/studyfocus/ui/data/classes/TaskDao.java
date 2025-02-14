package com.example.studyfocus.ui.data.classes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0019\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/studyfocus/ui/data/classes/TaskDao;", "", "deleteTask", "", "task", "Lcom/example/studyfocus/ui/data/classes/Task;", "(Lcom/example/studyfocus/ui/data/classes/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompletedTasks", "Lkotlinx/coroutines/flow/Flow;", "", "getIncompleteTasks", "getTasksForDate", "date", "", "isCompleted", "", "insertTask", "markTaskAsComplete", "taskId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markTaskAsIncomplete", "updateTask", "app_debug"})
@androidx.room.Dao
public abstract interface TaskDao {
    
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE isComplete = 0")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> getIncompleteTasks();
    
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE isComplete = 1")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> getCompletedTasks();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertTask(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTask(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE tasks SET isComplete = 1 WHERE id = :taskId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object markTaskAsComplete(int taskId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE tasks SET isComplete = 0 WHERE id = :taskId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object markTaskAsIncomplete(int taskId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE dueDate = :date AND isComplete = :isCompleted")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> getTasksForDate(long date, boolean isCompleted);
}