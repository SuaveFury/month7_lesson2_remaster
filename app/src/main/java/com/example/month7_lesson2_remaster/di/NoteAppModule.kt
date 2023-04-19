package com.example.month7_lesson2_remaster.di

import android.content.Context
import androidx.room.Room.databaseBuilder
import com.example.month7_lesson2_remaster.data.model.NoteDao
import com.example.month7_lesson2_remaster.data.model.NoteDataBase
import com.example.month7_lesson2_remaster.data.repository.NoteRepositoryImpl
import com.example.month7_lesson2_remaster.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteAppModule {
    @Provides
    @Singleton
        fun provideRoomNoteDataBase(@ApplicationContext context: Context): NoteDataBase =
        databaseBuilder(context, NoteDataBase::class.java,"notes").build()
    @Provides
    fun provideNoteDao(noteDataBase:NoteDataBase) = noteDataBase.doNoteDao()
    @Provides
    fun provideNOteRepository(noteDao:NoteDao): NoteRepository =
        NoteRepositoryImpl(noteDao)
}