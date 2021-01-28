package com.ms.starwars.models.states

import androidx.annotation.StringRes
import com.ms.starwars.models.CharacterEntity

/**
 * Created by Mehedi Hasan on 1/22/2021.
 */
sealed class SearchViewResult {
    data class Success(val data: List<CharacterEntity>) : SearchViewResult()
    data class Error(@StringRes val message: Int) : SearchViewResult()
    object Loading : SearchViewResult()
}
