package com.example.studyfocus.ui.data.repositories

import android.content.Context
import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import com.example.studyfocus.ui.viewmodels.SettingsViewModel
import com.example.studyfocus.ui.viewmodels.dataStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Singleton

class SettingsRepository (private val dataStore: DataStore<Preferences>) {

    companion object {
        private val FOCUS_DURATION_KEY = intPreferencesKey("focus_duration")
        private val SHORT_BREAK_DURATION_KEY = intPreferencesKey("short_break_duration")
        private val LONG_BREAK_DURATION_KEY = intPreferencesKey("long_break_duration")
        val THEME_SETTING_KEY = intPreferencesKey("theme_setting")
    }

    // Function to get focus duration
    fun getFocusDuration(): Flow<Int> = dataStore.data
        .map { preferences ->
            val duration = (preferences[FOCUS_DURATION_KEY] ?: 25) * 60
            Log.d("TimerSettingsRepo", "Focus Duration: $duration seconds")
            duration
        }

    // Function to get short break duration
    fun getShortBreakDuration(): Flow<Int> = dataStore.data
        .map { preferences ->
            val duration = (preferences[SHORT_BREAK_DURATION_KEY] ?: 5) * 60
            Log.d("TimerSettingsRepo", "Short Break Duration: $duration seconds")
            duration
        }

    // Function to get long break duration
    fun getLongBreakDuration(): Flow<Int> = dataStore.data
        .map { preferences ->
            val duration = (preferences[LONG_BREAK_DURATION_KEY] ?: 15) * 60
            Log.d("TimerSettingsRepo", "Long Break Duration: $duration seconds")
            duration
        }

    // Theming
    val themeSettingFlow: Flow<Int> = dataStore.data
        .map { preferences ->
            preferences[THEME_SETTING_KEY] ?: 2 // Default to System Theme
        }

    suspend fun updateThemeSetting(themeOption: Int) {
        dataStore.edit { preferences ->
            preferences[THEME_SETTING_KEY] = themeOption
        }
    }
}



@Module
@InstallIn(ViewModelComponent::class) // Scoped to ViewModel lifetime
object SettingsRepositoryModule {

    @Provides
    fun provideSettingsRepository(dataStore: DataStore<Preferences>): SettingsRepository {
        return SettingsRepository(dataStore)
    }
}


@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Provides
    @Singleton
    fun provideDataStore(@ApplicationContext context: Context): DataStore<Preferences> {
        return context.dataStore
    }
}


