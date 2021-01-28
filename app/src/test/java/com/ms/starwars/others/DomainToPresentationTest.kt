package com.ms.starwars.others

import com.google.common.truth.Truth
import com.ms.starwars.mappers.mapToEntity
import com.ms.starwars.utils.TestData.TEST_CHARACTER
import com.ms.starwars.utils.TestData.TEST_FILM
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class DomainToPresentationTest {

    @Test
    fun `check character mapToPresentation returns characterEntity object`() {
        val character = TEST_CHARACTER
        val characterEntity = character.mapToEntity()
        Truth.assertThat(character.name).isEqualTo(characterEntity.name)
        Truth.assertThat(characterEntity.heightInFtInches).isEqualTo("6 feet 7 inches")
    }


    @Test
    fun `check film mapToPresentation returns FilmEntity object`() {
        val film = TEST_FILM
        val filmEntity = film.mapToEntity()
        Truth.assertThat(film.title).isEqualTo(filmEntity.title)
        Truth.assertThat(film.characterList?.size).isEqualTo(filmEntity.characters.size)
    }

}