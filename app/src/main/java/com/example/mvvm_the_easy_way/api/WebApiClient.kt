package com.example.mvvm_the_easy_way.api

class WebApiClient(private val webApiService: WebApiService) : BaseApiClient() {
    suspend fun getAllPosts() = getResult {
        webApiService.getAllPosts()
    }

    suspend fun getAllComments() = getResult {
        webApiService.getAllComments()
    }

    suspend fun getAllTodos() = getResult {
        webApiService.getAllTodos()
    }

    suspend fun getAllPhotos() = getResult {
        webApiService.getAllPhotos()
    }
}