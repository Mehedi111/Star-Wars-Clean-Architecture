package com.ms.data.repository

import com.ms.data.api.ApiService
import com.ms.data.mappers.mapToDomain
import com.ms.data.models.FilmDetailResponse
import com.ms.domain.repository.CharacterDetailsDataSource
import com.ms.domain.models.Film
import com.ms.domain.models.Planet
import com.ms.domain.models.Specie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
class CharacterDetailsRepository(
    private val apiService: ApiService
) : CharacterDetailsDataSource {

    /**
     * ger planet of specific character
     * @param characterUrl is planet url to get character planet information
     */
    override suspend fun getCharacterPlanet(characterUrl: String): Flow<Planet> = flow {
        val planetResponse = apiService.getPlanet(characterUrl)
        val planet = apiService.getPlanetDetails(planetResponse.homeWorldUrl)
        emit(planet.mapToDomain())
    }

    /**
     * get species of specific character
     * @param characterUrl is specie url to get character specie information
     */
    override suspend fun getCharacterSpecies(characterUrl: String): Flow<List<Specie>> = flow {
        val speciesResponse = apiService.getSpecies(characterUrl)
        val species = mutableListOf<Specie>()

        //parse specieURL for getting individual Specie details from speciesResponse
        for (specieURL in speciesResponse.specieUrls) {
            val specieDetailResponse = apiService.getSpecieDetails(specieURL)

            val homeWorld =
                specieDetailResponse.homeWorldUrl?.let {
                    apiService.getPlanetDetails(it)
                }
            val specie = specieDetailResponse.mapToDomain().copy(homeWorldName = homeWorld?.name)

            species.add(specie)
        }
        emit(species)
    }


    /**
     * get films of specific character
     * @param characterUrl is film url to get character films information
     */
    override suspend fun getCharacterFilms(characterUrl: String): Flow<List<Film>> = flow {
        val filmResponse = apiService.getFilms(characterUrl)
        val films = mutableListOf<Film>()

        //parse filmURL for getting individual film details from filmResponse
        for (filmURL in filmResponse.filmUrls) {
            val filmDetailsResponse: FilmDetailResponse =
                apiService.getFilmDetails(filmURL)

            val filmCharacters = mutableListOf<String>()

            //parse filmCharactersUrl for getting individual character name
            for (charUrl in filmDetailsResponse.characters) {
                val character = apiService.getFilmCharacter(charUrl)
                filmCharacters.add(character.name)
            }

            val film = filmDetailsResponse.mapToDomain().copy(characterList = filmCharacters)
            films.add(film)

            //emit after getting each new film
            emit(films)
        }


    }

}