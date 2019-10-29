package com.dheeraj.architecture.base

import androidx.lifecycle.ViewModel
import com.dheeraj.architecture.injection.component.DaggerViewModelInjector
import com.dheeraj.architecture.injection.component.ViewModelInjector
import com.dheeraj.architecture.injection.module.NetworkModule
import com.dheeraj.architecture.ui.post.PostListViewModel
import com.dheeraj.architecture.ui.post.PostViewModel

abstract class BaseViewModel : ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }

}