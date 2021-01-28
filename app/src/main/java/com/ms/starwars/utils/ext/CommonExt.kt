package com.ms.starwars.utils.ext

import android.text.Spanned
import androidx.core.text.HtmlCompat

/**
 * Created by Mehedi Hasan on 1/22/2021.
 */


/**
 * string extension for read html from string.xml
 */
internal fun String.readHTML(): Spanned {
    return HtmlCompat.fromHtml(this, HtmlCompat.FROM_HTML_MODE_LEGACY)
}

/**
 * extension to concat all item from list to make a string
 */
internal fun List<String>.concat(): String {
    return this.joinToString(separator = ", ")
}