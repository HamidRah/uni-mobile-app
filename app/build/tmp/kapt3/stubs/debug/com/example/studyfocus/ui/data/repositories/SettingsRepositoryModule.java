package com.example.studyfocus.ui.data.repositories;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/studyfocus/ui/data/repositories/SettingsRepositoryModule;", "", "()V", "provideSettingsRepository", "Lcom/example/studyfocus/ui/data/repositories/SettingsRepository;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public final class SettingsRepositoryModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.studyfocus.ui.data.repositories.SettingsRepositoryModule INSTANCE = null;
    
    private SettingsRepositoryModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.studyfocus.ui.data.repositories.SettingsRepository provideSettingsRepository(@org.jetbrains.annotations.NotNull
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        return null;
    }
}