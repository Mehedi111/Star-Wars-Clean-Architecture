package com.ms.data.models

import com.squareup.moshi.Json

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
data class PlanetResponse(@field:Json(name = "homeworld") val homeWorldUrl: String)

data class PlanetDetailsResponse(val name: String, val population: String)