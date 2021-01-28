package com.ms.data.models

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
data class SearchResponse(
    val count: Int,
    val next: Any,
    val previous: Any,
    val results: List<CharacterResponse>
)