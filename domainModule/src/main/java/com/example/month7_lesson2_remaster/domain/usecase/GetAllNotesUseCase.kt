package com.example.month7_lesson2_remaster.domain.usecase

import com.example.month7_lesson2_remaster.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    fun getaAllNotes() = noteRepository.getAllNotes()
}