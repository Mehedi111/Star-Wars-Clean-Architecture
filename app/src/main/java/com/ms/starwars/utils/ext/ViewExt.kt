package com.ms.starwars.utils.ext

import android.view.View
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Mehedi Hasan on 1/22/2021.
 */

/**
 * recyclerview extension to make visible item at center position after scroll end
 */
internal fun RecyclerView.addSnapHelper() {
    LinearSnapHelper().attachToRecyclerView(this)
}

internal fun View.show() {
    this.visibility = View.VISIBLE
}

internal fun View.hide() {
    this.visibility = View.GONE
}
