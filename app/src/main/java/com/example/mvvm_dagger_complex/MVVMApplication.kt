package com.example.mvvm_dagger_complex

import android.app.Application
import com.example.mvvm_dagger_complex.di.component.ApplicationComponent
import com.example.mvvm_dagger_complex.di.component.DaggerApplicationComponent
import com.example.mvvm_dagger_complex.di.module.ApplicationModule

class MVVMApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

}
