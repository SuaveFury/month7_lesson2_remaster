package com.example.month7_lesson2_remaster.presentation.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.month7_lesson2_remaster.domain.utils.Resource
import com.example.month7_lesson2_remaster.presentation.utils.UIState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

open class BaseViewModel:ViewModel() {
    protected fun <T>Flow<Resource<T>>.collectData(_state:MutableStateFlow<UIState<T>>){
        viewModelScope.launch {
          collect{
                when(it){
                    is Resource.Error -> {
                        _state.value= UIState.Error(it.message!!)
                    }
                    is Resource.Loading -> {
                        _state.value= UIState.Loading()
                    }
                    is Resource.Success -> {
                        if (it.data!=null){
                            _state.value= UIState.Success(it.data!!)
                        }}
                }
            }
    }}
}