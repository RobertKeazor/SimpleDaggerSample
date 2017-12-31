package arch.weddingwire.com.simpledaggersample

import android.app.Application
import android.content.Context
import android.widget.Toast

class SecondObject(private val application: Context) {
    fun toastApp() = Toast.makeText(application, "Yep", Toast.LENGTH_LONG).show()
}

