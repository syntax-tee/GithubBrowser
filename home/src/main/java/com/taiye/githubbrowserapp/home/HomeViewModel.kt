package com.taiye.githubbrowserapp.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taiye.githubbrowserapp.home.list.RepoItem
import com.taiye.githubbrowserapp.repository.AppRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val appRepository: AppRepository) : ViewModel() {

    private val _viewState = MutableLiveData<HomeViewState>(HomeViewStateLoading)
    private val viewStateUpdates: LiveData<HomeViewState> = _viewState

    init {
        val topRepos = appRepository.getTopRepos()
        _viewState.value = HomeViewStateLoaded(
            repos = topRepos.map {
                RepoItem(
                    name = it.name,
                    description = it.description,
                    forkCount = it.forksCount,
                    starsCount = it.stargazersCount

                )
            }
        )
    }

}