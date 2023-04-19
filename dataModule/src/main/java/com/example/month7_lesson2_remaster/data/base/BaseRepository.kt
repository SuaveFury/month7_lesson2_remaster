package com.example.month7_lesson2_remaster.data.base

import com.example.month7_lesson2_remaster.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException
abstract class BaseRepository {
    protected fun <T> doRequest(request: suspend () -> T) = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(request()))
        } catch (ioException: IOException) {
            emit(
                Resource.Error(
                    ioException
                        .localizedMessage ?: "Unknown error "
                )
            )
        }}.flowOn(Dispatchers.IO)
}