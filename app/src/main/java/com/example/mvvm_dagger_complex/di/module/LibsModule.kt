package com.example.mvvm_dagger_complex.di.module

import android.content.Context
import com.example.mvvm_dagger_complex.Libs
import com.example.mvvm_dagger_complex.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class LibsModule(@ActivityContext private val activityContext: Context) {
    @Provides
    fun provideLibs(): Libs {
        return Libs(activityContext)
    }

}