package com.ms.starwars.utils

import com.ms.starwars.models.CharacterEntity

object DummyData {
    val characterEntity = CharacterEntity(
        name = "Wedge Antilles",
        birthYear = "21BBY",
        heightInCm = "170",
        heightInFtInches = "5 feet 6 inches",
        url = "/api/people/18/"
    )

}