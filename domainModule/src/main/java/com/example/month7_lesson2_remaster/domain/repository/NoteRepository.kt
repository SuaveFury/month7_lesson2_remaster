package com.example.month7_lesson2_remaster.domain.repository

import com.example.month7_lesson2_remaster.domain.model.NOte
import com.example.month7_lesson2_remaster.domain.utils.Resource
import kotlinx.coroutines.flow.Flow
interface NoteRepository {
    fun createNote(nOte: NOte): Flow<Resource<Unit>>
    fun getAllNotes(): Flow<Resource<List<NOte>>>
    fun editNote(nOte: NOte): Flow<Resource<Unit>>
    fun deleteNote(nOte: NOte): Flow<Resource<Unit>>
}