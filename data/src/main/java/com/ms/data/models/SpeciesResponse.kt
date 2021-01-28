package com.ms.data.models

import com.squareup.moshi.Json

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
data class SpeciesResponse(@field:Json(name = "species") val specieUrls: List<String>)

data class SpecieDetailResponse(
    val name: String,
    val language: String,
    @field:Json(name = "homeworld") val homeWorldUrl: String?
)