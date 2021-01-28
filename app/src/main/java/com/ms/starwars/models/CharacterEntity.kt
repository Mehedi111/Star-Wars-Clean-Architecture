package com.ms.starwars.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
@Parcelize
data class CharacterEntity(
    val name: String,
    val birthYear: String,
    val heightInCm: String,
    val heightInFtInches: String,
    val url: String
) : Parcelable