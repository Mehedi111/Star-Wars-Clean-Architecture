package com.ms.starwars.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Mehedi Hasan on 1/19/2021.
 */
@Parcelize
data class PlanetEntity(val name: String, val population: String) : Parcelable