package com.manodev.runningapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.manodev.runningapp.db.RunningDatabase
import com.manodev.runningapp.others.Constants
import com.manodev.runningapp.others.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRunningDatabase(@ApplicationContext app: Context) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}