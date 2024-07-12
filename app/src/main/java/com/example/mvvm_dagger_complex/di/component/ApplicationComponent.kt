package com.example.mvvm_dagger_complex.di.component

import android.content.Context
import com.example.mvvm_dagger_complex.MVVMApplication
import com.example.mvvm_dagger_complex.data.api.NetworkService
import com.example.mvvm_dagger_complex.data.repository.TopHeadlineRepository
import com.example.mvvm_dagger_complex.di.ApplicationContext
import com.example.mvvm_dagger_complex.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MVVMApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}