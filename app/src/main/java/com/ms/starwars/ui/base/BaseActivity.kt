package com.ms.starwars.ui.base

import android.content.Intent
import android.graphics.Color
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.ms.starwars.Constants
import com.ms.starwars.R
import com.ms.starwars.models.CharacterEntity
import com.ms.starwars.ui.details.DetailsActivity
import com.ms.starwars.utils.network.NetworkUtils

/**
 * Created by Mehedi Hasan on 1/17/2021.
 */
internal open class BaseActivity : AppCompatActivity() {

    /**
     * observe network change and
     * notifying subscribers
     * @param callback is subscribers for getting network change info.
     */
    internal fun onNetworkChange(callback: (Boolean) -> Unit) {
        NetworkUtils.getNetworkStatus(this)
            .observe(this, { isConnected ->
                callback(isConnected)
            })
    }

    /**
     * @param parentLayout is the root view
     * @param message what will be shown
     */
    internal fun showSnackBar(parentLayout: View?, message: String) {
        parentLayout?.let {
            Snackbar.make(it, message, Snackbar.LENGTH_LONG).apply {
                setAction(getString(R.string.text_ok)) {}
                setActionTextColor(Color.WHITE)
                show()
            }

        }

    }

    /**
     * move character's search page to details page with
     * selected character info from search result
     * @param characterEntity is the selected character model.
     */
    internal fun moveToDetails(characterEntity: CharacterEntity) {
        Intent(this, DetailsActivity::class.java).also {
            it.putExtra(Constants.PARCEL_KEY_CHAR, characterEntity)
            startActivity(it)
        }
    }
}