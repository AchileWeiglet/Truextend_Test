package com.truextend.interviewtx.ui.home

import com.truextend.interviewtx.data.ApiRepository
import com.truextend.interviewtx.ui.base.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import androidx.lifecycle.asLiveData

class HomeViewModel(): BaseViewModel() {

    val searchQuery = MutableStateFlow("")

//    private val tasksFlow = searchQuery.flatMapLatest {
//        apiRepository.getSongs(it)
//    }

   // val songs = tasksFlow.asLiveData()
}