package com.truextend.interviewtx.data

import com.truextend.interviewtx.model.Song
import kotlinx.coroutines.flow.Flow
import org.koin.core.component.KoinComponent

class ApiRepositoryImpl(
    private val apiService: ApiService
): ApiRepository, KoinComponent {
    override fun getSongs(searchQuery: String): Flow<List<Song>> {
        TODO("Not yet implemented")
    }

}