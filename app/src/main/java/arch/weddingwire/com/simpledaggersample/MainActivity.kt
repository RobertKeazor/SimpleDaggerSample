package arch.weddingwire.com.simpledaggersample

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import com.umairjavid.kombind.ui.KombindActivity
import dagger.android.AndroidInjection

import javax.inject.Inject

class MainActivity : KombindActivity<MainViewModel>() {
    override val layoutResId = R.layout.activity_main
    override val viewModelClass: Class<MainViewModel> = MainViewModel::class.java
    @Inject lateinit var factory: ViewModelProvider.Factory
    override fun provideViewModelFactory(): ViewModelProvider.Factory = factory

    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}
