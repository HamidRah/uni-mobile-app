package com.example.studyfocus.ui.viewmodels

import android.content.Context
import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.lifecycle.ViewModel
import com.example.studyfocus.ui.data.repositories.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val dataStore: DataStore<Preferences>
) : ViewModel() {

    companion object {
        val FOCUS_DURATION_KEY = intPreferencesKey("focus_duration")
        val SHORT_BREAK_DURATION_KEY = intPreferencesKey("short_break_duration")
        val LONG_BREAK_DURATION_KEY = intPreferencesKey("long_break_duration")
        val THEME_SETTING_KEY = intPreferencesKey("theme_setting")
    }

    val themeSettingFlow: Flow<Int> = dataStore.data
        .map { preferences ->
            preferences[THEME_SETTING_KEY] ?: 2 // Default to System Theme
        }

    suspend fun updateThemeSetting(themeOption: Int) {
        dataStore.edit { preferences ->
            preferences[THEME_SETTING_KEY] = themeOption
        }
    }

    val focusDurationFlow: Flow<Int> = dataStore.data
        .map { preferences ->
            preferences[FOCUS_DURATION_KEY] ?: 25 // Default value
        }

    val shortBreakDurationFlow: Flow<Int> = dataStore.data
        .map { preferences ->
            preferences[SHORT_BREAK_DURATION_KEY] ?: 5 // Default value
        }

    val longBreakDurationFlow: Flow<Int> = dataStore.data
        .map { preferences ->
            preferences[LONG_BREAK_DURATION_KEY] ?: 15 // Default value
        }

    suspend fun updateFocusDuration(duration: Int) {
        dataStore.edit { preferences ->
            preferences[FOCUS_DURATION_KEY] = duration
        }
    }

    suspend fun updateShortBreakDuration(duration: Int) {
        dataStore.edit { preferences ->
            preferences[SHORT_BREAK_DURATION_KEY] = duration
        }
    }

    suspend fun updateLongBreakDuration(duration: Int) {
        dataStore.edit { preferences ->
            preferences[LONG_BREAK_DURATION_KEY] = duration
        }
    }



    fun logCurrentSettings() {
        viewModelScope.launch {
            dataStore.data.collect { preferences ->
                val focusDuration = preferences[FOCUS_DURATION_KEY] ?: "Not Set"
                val shortBreakDuration = preferences[SHORT_BREAK_DURATION_KEY] ?: "Not Set"
                val longBreakDuration = preferences[LONG_BREAK_DURATION_KEY] ?: "Not Set"

                Log.d("SettingsViewModel", "Focus Duration: $focusDuration")
                Log.d("SettingsViewModel", "Short Break Duration: $shortBreakDuration")
                Log.d("SettingsViewModel", "Long Break Duration: $longBreakDuration")
            }
        }
    }
}
