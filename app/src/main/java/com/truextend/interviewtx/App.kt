package com.truextend.interviewtx

import android.app.Application
import com.truextend.interviewtx.di.apiModule
import com.truextend.interviewtx.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.module.Module

class App: Application() {
    lateinit var koinModules: List<Module>

    override fun onCreate() {
        super.onCreate()
        koinModules = listOf(
            viewModelModule,
            apiModule
        )
        startKoin {
            androidContext(this@App)
            modules(koinModules)
        }
    }
}