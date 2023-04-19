package com.example.month7_lesson2_remaster.presentation.ui.fragments

import androidx.lifecycle.MutableLiveData
import com.example.month7_lesson2_remaster.domain.model.NOte
import com.example.month7_lesson2_remaster.domain.usecase.CreateNoteUseCase
import com.example.month7_lesson2_remaster.domain.usecase.EditNoteUseCase
import com.example.month7_lesson2_remaster.presentation.ui.base.BaseViewModel
import com.example.month7_lesson2_remaster.presentation.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class EditNoteViewModel @Inject constructor(
    private val createNoteUseCase: CreateNoteUseCase,
    private val editNoteUseCase: EditNoteUseCase,
):BaseViewModel() {
    private val _createNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val createNoteState = _createNoteState.asStateFlow()
    private val _editNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val editNoteState = _editNoteState.asStateFlow()
    val loading = MutableLiveData<Boolean>()
    fun addNote(note: NOte) {
        createNoteUseCase.createNOte(note).collectData(_createNoteState)
    }
    fun editNote(note: NOte){
              editNoteUseCase.editNOte(note).collectData(_editNoteState)}
    }