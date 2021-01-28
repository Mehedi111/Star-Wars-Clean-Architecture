package com.ms.starwars.fakeUseCases

import com.ms.domain.models.Character
import com.ms.domain.models.Film
import com.ms.domain.models.Planet
import com.ms.domain.models.Specie

typealias SearchBaseTestUseCase = BaseTestUseCase<List<Character>, String>

typealias PlanetBaseTestUseCase = BaseTestUseCase<Planet, String>

typealias SpeciesBaseTestUseCase = BaseTestUseCase<List<Specie>, String>

typealias FilmBaseTestUseCase = BaseTestUseCase<List<Film>, String>

