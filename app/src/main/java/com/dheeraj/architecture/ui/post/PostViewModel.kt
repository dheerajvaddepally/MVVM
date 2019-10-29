package com.dheeraj.architecture.ui.post

import androidx.lifecycle.MutableLiveData
import com.dheeraj.architecture.base.BaseViewModel
import com.dheeraj.architecture.model.Post

class PostViewModel:BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}