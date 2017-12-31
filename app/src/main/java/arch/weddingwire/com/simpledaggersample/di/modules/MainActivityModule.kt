package arch.weddingwire.com.simpledaggersample.di.modules

import android.app.Application
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import arch.weddingwire.com.simpledaggersample.MainViewModel
import arch.weddingwire.com.simpledaggersample.SecondObject
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    internal fun provideSecondObject(context: Context) = SecondObject(context)

    @Provides
    internal fun providesViewModelFactor(application: Application): ViewModelProvider.Factory = MainViewModel.Factory(application)
}