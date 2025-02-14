package com.example.studyfocus.ui.data.repositories

import android.annotation.SuppressLint
import android.content.Context
import android.media.RingtoneManager
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.studyfocus.MyApp
import com.example.studyfocus.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

class NotificationRepository(private val context: Context) {

    companion object {
        private const val NOTIFICATION_ID = 1
    }

    @SuppressLint("MissingPermission")
    fun sendNotification(title: String, message: String) {
        val notificationSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val builder = NotificationCompat.Builder(context, MyApp.CHANNEL_ID)
<<<<<<< HEAD
            .setSmallIcon(R.drawable.mobileapplicationv5)
=======
            .setSmallIcon(R.drawable.ic_launcher_foreground)
>>>>>>> f0e249e (Fixed timer countdown)
            .setContentTitle(title)
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setSound(notificationSound) // Set the notification sound

        with(NotificationManagerCompat.from(context)) {
            notify(NOTIFICATION_ID, builder.build())
        }
    }

}

@Module
@InstallIn(SingletonComponent::class)
object NotificationModule {

    @Singleton
    @Provides
    fun provideNotificationRepository(@ApplicationContext context: Context): NotificationRepository {
        return NotificationRepository(context)
    }
}
