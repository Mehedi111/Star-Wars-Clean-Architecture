package com.ms.starwars.models.states.details

import androidx.annotation.StringRes
import com.ms.starwars.models.FilmEntity

/**
 * Created by Mehedi Hasan on 1/22/2021.
 */
sealed class FilmsViewResult {
    data class Success(val data: List<FilmEntity>) : FilmsViewResult()
    data class Error(@StringRes val message: Int) : FilmsViewResult()
    object Loading : FilmsViewResult()
    object IsCompleted : FilmsViewResult()
}
