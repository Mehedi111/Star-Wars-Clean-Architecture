package com.ms.data.models

import com.squareup.moshi.Json

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
data class CharacterResponse(
    val name: String,
    @field:Json(name = "birth_year") val birthYear: String,
    val height: String,
    val url: String
)