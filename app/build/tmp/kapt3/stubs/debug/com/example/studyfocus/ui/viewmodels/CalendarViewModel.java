package com.example.studyfocus.ui.viewmodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/studyfocus/ui/viewmodels/CalendarViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/example/studyfocus/ui/data/repositories/TaskRepository;", "(Lcom/example/studyfocus/ui/data/repositories/TaskRepository;)V", "_selectedDate", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "completeTasks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/studyfocus/ui/data/classes/Task;", "getCompleteTasks$annotations", "()V", "getCompleteTasks", "()Lkotlinx/coroutines/flow/Flow;", "incompleteTasks", "getIncompleteTasks$annotations", "getIncompleteTasks", "selectedDate", "Lkotlinx/coroutines/flow/StateFlow;", "onDateSelected", "", "date", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CalendarViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.studyfocus.ui.data.repositories.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> _selectedDate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Long> selectedDate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> incompleteTasks = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> completeTasks = null;
    
    @javax.inject.Inject
    public CalendarViewModel(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.repositories.TaskRepository taskRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> getIncompleteTasks() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated
    public static void getIncompleteTasks$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.studyfocus.ui.data.classes.Task>> getCompleteTasks() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated
    public static void getCompleteTasks$annotations() {
    }
    
    public final void onDateSelected(long date) {
    }
}