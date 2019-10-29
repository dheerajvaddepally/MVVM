package com.dheeraj.architecture.network

import com.dheeraj.architecture.model.Post
import io.reactivex.Observable
import retrofit2.http.GET


interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}