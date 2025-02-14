package com.example.studyfocus.ui.viewmodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/studyfocus/ui/viewmodels/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/example/studyfocus/ui/data/repositories/TaskRepository;", "(Lcom/example/studyfocus/ui/data/repositories/TaskRepository;)V", "completedTasks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/studyfocus/ui/data/classes/Task;", "getCompletedTasks", "()Lkotlinx/coroutines/flow/Flow;", "incompleteTasks", "getIncompleteTasks", "addTask", "", "task", "deleteTask", "markTaskComplete", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.studyfocus.ui.data.repositories.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> incompleteTasks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> completedTasks = null;
    
    @javax.inject.Inject
    public TaskViewModel(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.repositories.TaskRepository taskRepository) {
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
    
    public final void addTask(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.Task task) {
    }
    
    public final void markTaskComplete(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.Task task) {
    }
    
    public final void deleteTask(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.classes.Task task) {
    }
}