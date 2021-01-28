package com.ms.starwars.models.states.details

import androidx.annotation.StringRes
import com.ms.starwars.models.PlanetEntity

/**
 * Created by Mehedi Hasan on 1/22/2021.
 */
sealed class PlanetViewResult {
    data class Success(val data: PlanetEntity) : PlanetViewResult()
    data class Error(@StringRes val message: Int) : PlanetViewResult()
    object Loading : PlanetViewResult()
}
