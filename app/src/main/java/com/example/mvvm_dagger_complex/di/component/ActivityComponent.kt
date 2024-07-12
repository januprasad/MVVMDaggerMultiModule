package com.example.mvvm_dagger_complex.di.component

import com.example.mvvm_dagger_complex.di.ActivityScope
import com.example.mvvm_dagger_complex.di.module.ActivityModule
import com.example.mvvm_dagger_complex.ui.TopHeadlineActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}
