package arch.weddingwire.com.simpledaggersample

import android.os.Bundle
import dagger.android.DaggerActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerActivity() {
    @Inject lateinit  var secondObject: SecondObject

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener { secondObject.toastApp() }
    }
}
