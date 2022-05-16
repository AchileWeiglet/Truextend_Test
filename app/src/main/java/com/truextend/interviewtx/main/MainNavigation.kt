package com.truextend.interviewtx.main

import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import com.truextend.interviewtx.R

fun FragmentActivity.fromSplashToHome() {
    navigateWithTryCatch {
        with(Navigation.findNavController(this, R.id.navHost)) {
            navigate(R.id.action_splash_to_homeFragment)
        }
    }
}

private fun navigateWithTryCatch(navigate: () -> Unit) {
    try {
        navigate.invoke()
    } catch (e: Exception) {
        println(e)
    }
}