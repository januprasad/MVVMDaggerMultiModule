package com.example.mvvm_dagger_complex.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_dagger_complex.data.repository.TopHeadlineRepository
import com.example.mvvm_dagger_complex.di.ActivityContext
import com.example.mvvm_dagger_complex.ui.TopHeadlineAdapter
import com.example.mvvm_dagger_complex.ui.TopHeadlineViewModel
import com.example.mvvm_dagger_complex.ui.base.ViewModelProviderFactory
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideTopHeadlineViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlineViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(TopHeadlineViewModel::class) {
                TopHeadlineViewModel(topHeadlineRepository)
            })[TopHeadlineViewModel::class.java]
    }

    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter(ArrayList())

}
