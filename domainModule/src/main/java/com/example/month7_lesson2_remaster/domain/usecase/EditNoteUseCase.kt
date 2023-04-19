package com.example.month7_lesson2_remaster.domain.usecase

import com.example.month7_lesson2_remaster.domain.model.NOte
import com.example.month7_lesson2_remaster.domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {fun editNOte(note: NOte) = noteRepository.editNote(note)}