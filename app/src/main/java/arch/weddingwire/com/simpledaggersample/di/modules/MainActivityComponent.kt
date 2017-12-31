package arch.weddingwire.com.simpledaggersample.di.modules

import arch.weddingwire.com.simpledaggersample.MainActivity
import dagger.android.AndroidInjector
import dagger.Subcomponent

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}