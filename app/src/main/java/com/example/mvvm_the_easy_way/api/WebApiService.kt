package com.example.mvvm_the_easy_way.api

import com.example.mvvm_the_easy_way.model.Comment
import com.example.mvvm_the_easy_way.model.Photo
import com.example.mvvm_the_easy_way.model.Post
import com.example.mvvm_the_easy_way.model.Todo
import retrofit2.Response
import retrofit2.http.GET

interface WebApiService {
    @GET("posts")
    suspend fun getAllPosts(): Response<List<Post>>

    @GET("comments")
    suspend fun getAllComments(): Response<List<Comment>>

    @GET("todos")
    suspend fun getAllTodos(): Response<List<Todo>>

    @GET("photos")
    suspend fun getAllPhotos(): Response<List<Photo>>
}