package com.example.studyfocus.ui.data.classes

import androidx.lifecycle.ViewModel
import com.example.studyfocus.ui.viewmodels.TimerViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

enum class TimerState {
    Running,
    Paused,
    Default
}

enum class TimerType {
    Focus,
    ShortBreak,
    LongBreak
}

@Module
@InstallIn(ViewModelComponent::class)
abstract class TimerViewModelModule {

    @Binds
    abstract fun bindTimerViewModel(timerViewModel: TimerViewModel): ViewModel
}
