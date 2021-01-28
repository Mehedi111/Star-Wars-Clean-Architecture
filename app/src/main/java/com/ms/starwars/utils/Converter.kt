package com.ms.starwars.utils

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */

/**
 * convert centimeter to feet and inch
 * @param cm value in centimeter
 */
internal fun convertToFeetInches(cm: String): String {
    val cmInt = cm.toDoubleOrNull()
    return cmInt?.let {
        val totalInches = it / 2.54
        val feet = ((totalInches - totalInches % 12) / 12).toInt()
        val inches = (totalInches % 12).toInt()

        if (inches != 0) "$feet feet $inches inches" else "$feet feet"

    } ?: return ""
}

