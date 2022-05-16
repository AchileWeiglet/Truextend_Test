package com.truextend.interviewtx.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.truextend.interviewtx.R
import com.truextend.interviewtx.databinding.FragmentSplashBinding
import com.truextend.interviewtx.main.fromSplashToHome
import com.truextend.interviewtx.ui.base.BaseFragment

class SplashFragment: BaseFragment<SplashViewModel, FragmentSplashBinding>(SplashViewModel::class) {
    override val layoutId: Int
        get() = R.layout.fragment_splash

    override fun initObservers() {
        viewModel.showHome.observe(this) {
            if (it) {
                activity?.fromSplashToHome()
            }
        }
    }

    override fun initBindingOrUIValues() {
        binding.viewModel = viewModel
    }

}