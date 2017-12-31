package arch.weddingwire.com.simpledaggersample.di.modules

import android.content.Context
import arch.weddingwire.com.simpledaggersample.SecondObject
import dagger.Module
import dagger.Provides


@Module
class MainActivityModule {
    @Provides
    internal fun provideSecondObject(context: Context) = SecondObject(context)

}