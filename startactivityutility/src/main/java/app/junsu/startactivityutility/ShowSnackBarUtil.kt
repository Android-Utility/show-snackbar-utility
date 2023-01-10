package app.junsu.startactivityutility

import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.LENGTH_LONG
import com.google.android.material.snackbar.Snackbar.LENGTH_SHORT

object ShowSnackBarUtil {

    private fun <V : ViewGroup> V.showSnackBar(text: String, length: Int) {
        Snackbar.make(
            /* view = */
            this,
            /* text = */
            text,
            /* duration = */
            length,
        ).show()
    }

    fun <V : ViewGroup> V.showShortSnackBar(text: String) {
        showSnackBar(
            text = text,
            length = LENGTH_SHORT,
        )
    }

    fun <V : ViewGroup> V.showLongSnackBar(text: String) {
        showSnackBar(
            text = text,
            length = LENGTH_LONG,
        )
    }
}
