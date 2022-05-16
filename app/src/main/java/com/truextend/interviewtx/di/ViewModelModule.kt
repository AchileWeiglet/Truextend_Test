package com.truextend.interviewtx.di

import com.truextend.interviewtx.data.ApiRepository
import com.truextend.interviewtx.data.ApiRepositoryImpl
import com.truextend.interviewtx.ui.home.HomeViewModel
import com.truextend.interviewtx.ui.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SplashViewModel() }
    //viewModel { HomeViewModel(apiRepository = get()) }
    viewModel { HomeViewModel() }
}

val apiModule = module {
    single<ApiRepository> { ApiRepositoryImpl(get()) }
}