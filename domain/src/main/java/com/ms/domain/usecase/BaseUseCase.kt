package com.ms.domain.usecase

/**
 * Created by Mehedi Hasan on 1/16/2021.
 */
interface BaseUseCase<in Parameter, out Result> {
    suspend operator fun invoke(params: Parameter): Result
}
