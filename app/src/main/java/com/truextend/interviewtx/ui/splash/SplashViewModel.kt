package com.truextend.interviewtx.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.truextend.interviewtx.ui.base.BaseViewModel
import java.util.Timer
import kotlin.concurrent.schedule

class SplashViewModel: BaseViewModel()  {
    private val _showHome = MutableLiveData<Boolean>(false)
    val showHome: LiveData<Boolean>
        get() = _showHome

    init {
        Timer("Open", false).schedule(DELAY) {
            _showHome.postValue(true)
        }
    }
    companion object {
        private const val DELAY = 1000L
    }
}