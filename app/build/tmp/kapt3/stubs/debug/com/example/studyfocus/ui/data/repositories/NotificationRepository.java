package com.example.studyfocus.ui.data.repositories;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/studyfocus/ui/data/repositories/NotificationRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sendNotification", "", "title", "", "message", "Companion", "app_debug"})
public final class NotificationRepository {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private static final int NOTIFICATION_ID = 1;
    @org.jetbrains.annotations.NotNull
    public static final com.example.studyfocus.ui.data.repositories.NotificationRepository.Companion Companion = null;
    
    public NotificationRepository(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void sendNotification(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/studyfocus/ui/data/repositories/NotificationRepository$Companion;", "", "()V", "NOTIFICATION_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}