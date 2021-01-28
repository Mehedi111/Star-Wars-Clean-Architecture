package com.ms.starwars.utils

import java.io.InputStreamReader

object Parser {
    fun getJson(fileName: String): String {
        return InputStreamReader(javaClass.classLoader!!.getResourceAsStream(fileName)).use { it.readText() }
    }
}