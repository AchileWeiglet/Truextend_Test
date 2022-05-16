package com.truextend.interviewtx.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.truextend.interviewtx.Extensions.Event

open class BaseViewModel: ViewModel() {

    private val _showMessage = MutableLiveData<Event<String>>()
    val showMessage: LiveData<Event<String>>
        get() = _showMessage

    fun showMessageAction(message: String) {
        _showMessage.postValue(Event(message))
    }
}