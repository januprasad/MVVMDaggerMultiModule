package com.example.mvvm_dagger_complex.di.component

import com.example.mvvm_dagger_complex.di.ActivityScope
import com.example.mvvm_dagger_complex.di.module.ActivityModule
import com.example.mvvm_dagger_complex.di.module.LibsModule
import com.example.mvvm_dagger_complex.ui.TopHeadlineActivity
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class, LibsModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}
