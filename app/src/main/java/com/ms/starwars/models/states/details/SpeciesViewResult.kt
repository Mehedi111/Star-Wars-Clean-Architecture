package com.ms.starwars.models.states.details

import androidx.annotation.StringRes
import com.ms.starwars.models.SpecieEntity

/**
 * Created by Mehedi Hasan on 1/22/2021.
 */
sealed class SpeciesViewResult {
    data class Success(val data: List<SpecieEntity>) : SpeciesViewResult()
    data class Error(@StringRes val message: Int) : SpeciesViewResult()
    object Loading : SpeciesViewResult()
}
