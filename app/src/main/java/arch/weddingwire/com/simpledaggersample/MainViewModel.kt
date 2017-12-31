package arch.weddingwire.com.simpledaggersample

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.umairjavid.kombind.ui.KombindViewModel

class MainViewModel(application: Application) : KombindViewModel(application) {
    class Factory(private val application: Application) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = MainViewModel(application) as T
    }
}