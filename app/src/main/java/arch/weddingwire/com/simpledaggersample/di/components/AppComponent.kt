package arch.weddingwire.com.simpledaggersample.di.components

import android.app.Application
import arch.weddingwire.com.simpledaggersample.di.ActivityBuilder
import arch.weddingwire.com.simpledaggersample.di.AndroidSampleApp
import arch.weddingwire.com.simpledaggersample.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = ([AndroidInjectionModule::class,
    AppModule::class,
    ActivityBuilder::class]))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: AndroidSampleApp)

}