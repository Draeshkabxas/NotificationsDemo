package com.tutorials.eu.notificationssample

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import com.derar.libya.notificationsdemo.BigPictureStyleMockData
import com.derar.libya.notificationsdemo.InBoxStyleMockData

class NotificationUtil {

    fun createInboxStyleNotificationChannel(context: Context): String {

        // NotificationChannels are required for Notifications on O (API 26) and above.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            // The id of the channel.
            val channelId: String = InBoxStyleMockData.mChannelId

            // The user-visible name of the channel.
            val channelName: CharSequence = InBoxStyleMockData.mChannelName
            // The user-visible description of the channel.
            val channelDescription: String = InBoxStyleMockData.mChannelDescription
            val channelImportance: Int = InBoxStyleMockData.mChannelImportance
            val channelEnableVibrate: Boolean = InBoxStyleMockData.mChannelEnableVibrate
            val channelLockscreenVisibility: Int =
                InBoxStyleMockData.mChannelLockscreenVisibility

            // Initializes NotificationChannel.
            val notificationChannel = NotificationChannel(channelId, channelName, channelImportance)
            notificationChannel.description = channelDescription
            notificationChannel.enableVibration(channelEnableVibrate)
            notificationChannel.lockscreenVisibility = channelLockscreenVisibility

            // Adds NotificationChannel to system. Attempting to create an existing notification
            // channel with its original values performs no operation, so it's safe to perform the
            // below sequence.
            val notificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(notificationChannel)
            return channelId
        } else {
            // Returns null for pre-O (26) devices.
            return ""
        }
    }

    // Step 4: Create a function to create notification channel for BigPictureStyle. We can use the same that we have created for InboxStyle but for learning purpose it is better to create separate.
    // START
    fun createBigPictureStyleNotificationChannel(context: Context): String {

        // NotificationChannels are required for Notifications on O (API 26) and above.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            // The id of the channel.
            val channelId: String = BigPictureStyleMockData.mChannelId

            // The user-visible name of the channel.
            val channelName: CharSequence = BigPictureStyleMockData.mChannelName
            // The user-visible description of the channel.
            val channelDescription: String = BigPictureStyleMockData.mChannelDescription
            val channelImportance: Int = BigPictureStyleMockData.mChannelImportance
            val channelEnableVibrate: Boolean = BigPictureStyleMockData.mChannelEnableVibrate
            val channelLockscreenVisibility: Int =
                BigPictureStyleMockData.mChannelLockscreenVisibility

            // Initializes NotificationChannel.
            val notificationChannel = NotificationChannel(channelId, channelName, channelImportance)
            notificationChannel.description = channelDescription
            notificationChannel.enableVibration(channelEnableVibrate)
            notificationChannel.lockscreenVisibility = channelLockscreenVisibility

            // Adds NotificationChannel to system. Attempting to create an existing notification
            // channel with its original values performs no operation, so it's safe to perform the
            // below sequence.
            val notificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(notificationChannel)
            return channelId
        } else {
            // Returns null for pre-O (26) devices.
            return ""
        }
    }
    // END
}
