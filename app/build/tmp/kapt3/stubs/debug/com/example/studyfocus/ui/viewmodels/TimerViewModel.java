package com.example.studyfocus.ui.viewmodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u000234B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020.J\u0006\u00100\u001a\u00020.J\u0006\u00101\u001a\u00020.J\b\u00102\u001a\u00020.H\u0002R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000e0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00110\u00110\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00140\u00140\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00190\u00190\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u000e\u0010\"\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001d\u00a8\u00065"}, d2 = {"Lcom/example/studyfocus/ui/viewmodels/TimerViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/studyfocus/ui/data/repositories/TaskRepository;", "settingsRepository", "Lcom/example/studyfocus/ui/data/repositories/SettingsRepository;", "notificationRepository", "Lcom/example/studyfocus/ui/data/repositories/NotificationRepository;", "(Lcom/example/studyfocus/ui/data/repositories/TaskRepository;Lcom/example/studyfocus/ui/data/repositories/SettingsRepository;Lcom/example/studyfocus/ui/data/repositories/NotificationRepository;)V", "_currentMode", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/studyfocus/ui/viewmodels/TimerViewModel$TimerMode;", "kotlin.jvm.PlatformType", "_currentState", "Lcom/example/studyfocus/ui/data/classes/TimerState;", "_focusDuration", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_focusSessionCount", "_isRunning", "", "_longBreakDuration", "_shortBreakDuration", "_timeLeft", "_timerLoadingState", "Lcom/example/studyfocus/ui/viewmodels/TimerViewModel$TimerLoadingState;", "currentMode", "Landroidx/lifecycle/LiveData;", "getCurrentMode", "()Landroidx/lifecycle/LiveData;", "currentState", "getCurrentState", "focusSessionCount", "getFocusSessionCount", "focusSessionCountValue", "formattedTimeLeft", "", "getFormattedTimeLeft", "isRunning", "timeLeft", "getTimeLeft", "timerJob", "Lkotlinx/coroutines/Job;", "timerLoadingState", "getTimerLoadingState", "initializeTimer", "", "pauseTimer", "resetTimer", "startTimer", "switchMode", "TimerLoadingState", "TimerMode", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class TimerViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.studyfocus.ui.data.repositories.TaskRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.studyfocus.ui.data.repositories.SettingsRepository settingsRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.studyfocus.ui.data.repositories.NotificationRepository notificationRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _focusDuration = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _shortBreakDuration = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _longBreakDuration = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.studyfocus.ui.viewmodels.TimerViewModel.TimerLoadingState> _timerLoadingState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.studyfocus.ui.viewmodels.TimerViewModel.TimerLoadingState> timerLoadingState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isRunning = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isRunning = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.studyfocus.ui.data.classes.TimerState> _currentState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.studyfocus.ui.data.classes.TimerState> currentState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _timeLeft = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> timeLeft = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> formattedTimeLeft = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.studyfocus.ui.viewmodels.TimerViewModel.TimerMode> _currentMode = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.studyfocus.ui.viewmodels.TimerViewModel.TimerMode> currentMode = null;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job timerJob;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _focusSessionCount;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> focusSessionCount = null;
    private int focusSessionCountValue = 0;
    
    @javax.inject.Inject
    public TimerViewModel(@org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.repositories.TaskRepository repository, @org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.repositories.SettingsRepository settingsRepository, @org.jetbrains.annotations.NotNull
    com.example.studyfocus.ui.data.repositories.NotificationRepository notificationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.studyfocus.ui.viewmodels.TimerViewModel.TimerLoadingState> getTimerLoadingState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isRunning() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.studyfocus.ui.data.classes.TimerState> getCurrentState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTimeLeft() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getFormattedTimeLeft() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.studyfocus.ui.viewmodels.TimerViewModel.TimerMode> getCurrentMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getFocusSessionCount() {
        return null;
    }
    
    public final void initializeTimer() {
    }
    
    public final void startTimer() {
    }
    
    public final void pauseTimer() {
    }
    
    public final void resetTimer() {
    }
    
    private final void switchMode() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/studyfocus/ui/viewmodels/TimerViewModel$TimerLoadingState;", "", "(Ljava/lang/String;I)V", "Loading", "Loaded", "app_debug"})
    public static enum TimerLoadingState {
        /*public static final*/ Loading /* = new Loading() */,
        /*public static final*/ Loaded /* = new Loaded() */;
        
        TimerLoadingState() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.example.studyfocus.ui.viewmodels.TimerViewModel.TimerLoadingState> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/studyfocus/ui/viewmodels/TimerViewModel$TimerMode;", "", "(Ljava/lang/String;I)V", "Focus", "ShortBreak", "LongBreak", "app_debug"})
    public static enum TimerMode {
        /*public static final*/ Focus /* = new Focus() */,
        /*public static final*/ ShortBreak /* = new ShortBreak() */,
        /*public static final*/ LongBreak /* = new LongBreak() */;
        
        TimerMode() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.example.studyfocus.ui.viewmodels.TimerViewModel.TimerMode> getEntries() {
            return null;
        }
    }
}