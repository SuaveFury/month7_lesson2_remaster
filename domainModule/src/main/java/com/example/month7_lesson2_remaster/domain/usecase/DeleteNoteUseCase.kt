package com.example.month7_lesson2_remaster.domain.usecase

import com.example.month7_lesson2_remaster.domain.model.NOte
import com.example.month7_lesson2_remaster.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {
    fun deleteNOte(nOte: NOte) = noteRepository.deleteNote(nOte)
}