package com.example.studyfocus.ui.viewmodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/example/studyfocus/ui/viewmodels/ReportViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/example/studyfocus/ui/data/repositories/TaskRepository;", "(Lcom/example/studyfocus/ui/data/repositories/TaskRepository;)V", "completedTaskCount", "Landroidx/lifecycle/LiveData;", "", "getCompletedTaskCount", "()Landroidx/lifecycle/LiveData;", "incompleteTaskCount", "getIncompleteTaskCount", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ReportViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> completedTaskCount = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> incompleteTaskCount = null;
    
    @javax.inject.Inject
    public ReportViewModel(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.repositories.TaskRepository taskRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCompletedTaskCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getIncompleteTaskCount() {
        return null;
    }
}