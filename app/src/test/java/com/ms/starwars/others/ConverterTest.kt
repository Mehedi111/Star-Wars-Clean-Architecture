package com.ms.starwars.others

import com.google.common.truth.Truth
import com.ms.starwars.utils.convertToFeetInches
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ConverterTest {

    @Test
    fun `height in cm returns height in Feet and inches`() {
        val heightInFt = convertToFeetInches("202")
        Truth.assertThat(heightInFt).isEqualTo("6 feet 7 inches")
    }

    @Test
    fun `height in cm returns height in Feet only if inches is 0`() {
        val heightInFt = convertToFeetInches("183")
        Truth.assertThat(heightInFt).isEqualTo("6 feet")
    }

    @Test
    fun `pass invalid height returns empty`() {
        val heightInFt = convertToFeetInches("unknown")
        Truth.assertThat(heightInFt).isEmpty()
    }
}