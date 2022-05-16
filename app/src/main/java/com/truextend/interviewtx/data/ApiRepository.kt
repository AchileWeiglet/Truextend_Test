package com.truextend.interviewtx.data

import com.truextend.interviewtx.model.Song
import kotlinx.coroutines.flow.Flow

interface ApiRepository {

    fun getSongs(searchQuery: String): Flow<List<Song>>
}