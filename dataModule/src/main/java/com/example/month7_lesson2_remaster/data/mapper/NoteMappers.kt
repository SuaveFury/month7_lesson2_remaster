package com.example.month7_lesson2_remaster.data.mapper

import com.example.month7_lesson2_remaster.data.model.NoteEntity
import com.example.month7_lesson2_remaster.domain.model.NOte
fun NOte.toEntity() = NoteEntity(
    id, title, desc
)fun NoteEntity.toNOte() = NOte(
    id,title,desc
)