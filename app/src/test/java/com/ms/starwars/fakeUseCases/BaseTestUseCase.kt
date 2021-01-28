package com.ms.starwars.fakeUseCases

import com.ms.starwars.utils.State
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

abstract class BaseTestUseCase<out T, in P>(private val type: State) {

    fun execute(params: P): Flow<T> = flow {
        when (type) {
            State.SUCCESS -> emit(getValue(params))
            State.ERROR -> throw Exception("Something went wrong")
        }
    }

    abstract fun getValue(params: P): T
}