package com.example.studyfocus.ui.data.repositories;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/studyfocus/ui/data/repositories/TaskRepository;", "", "taskDao", "Lcom/example/studyfocus/ui/data/classes/TaskDao;", "(Lcom/example/studyfocus/ui/data/classes/TaskDao;)V", "completedTasks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/studyfocus/ui/data/classes/Task;", "getCompletedTasks", "()Lkotlinx/coroutines/flow/Flow;", "incompleteTasks", "getIncompleteTasks", "addTask", "", "task", "(Lcom/example/studyfocus/ui/data/classes/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "getTasksForDate", "date", "", "isCompleted", "", "markTaskAsComplete", "taskId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markTaskAsIncomplete", "updateTask", "app_debug"})
public final class TaskRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.studyfocus.ui.data.classes.TaskDao taskDao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> incompleteTasks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> completedTasks = null;
    
    public TaskRepository(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.TaskDao taskDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> getIncompleteTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> getCompletedTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addTask(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateTask(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object markTaskAsComplete(int taskId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object markTaskAsIncomplete(int taskId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> getTasksForDate(long date, boolean isCompleted) {
        return null;
    }
}