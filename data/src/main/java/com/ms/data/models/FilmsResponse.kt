package com.ms.data.models

import com.squareup.moshi.Json

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */

data class FilmsResponse(@field:Json(name = "films") val filmUrls: List<String>)

data class FilmDetailResponse(
    val title: String,
    @field:Json(name = "opening_crawl") val openingCrawl: String,
    @field:Json(name = "characters") val characters: List<String>
)