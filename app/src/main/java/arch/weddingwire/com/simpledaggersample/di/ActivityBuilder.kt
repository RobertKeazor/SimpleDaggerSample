package arch.weddingwire.com.simpledaggersample.di

import android.app.Activity
import arch.weddingwire.com.simpledaggersample.MainActivity
import arch.weddingwire.com.simpledaggersample.di.modules.MainActivityComponent
import dagger.android.AndroidInjector
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import dagger.Binds
import dagger.Module

@Module
abstract class ActivityBuilder {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>
}