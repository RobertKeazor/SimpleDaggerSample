package arch.weddingwire.com.simpledaggersample.di.modules

import android.app.Application
import android.content.Context
import dagger.Module
import javax.inject.Singleton
import dagger.Provides

@Module(subcomponents = [MainActivityComponent::class])
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context {
        return application
    }
}