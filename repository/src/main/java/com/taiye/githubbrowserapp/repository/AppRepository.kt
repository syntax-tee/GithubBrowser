package com.taiye.githubbrowserapp.repository

import com.taiye.githubbrowserapp.githubapi.GithubApi
import com.taiye.githubbrowserapp.githubapi.model.RepoApiModel
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class AppRepository @Inject constructor(
      private val githubApi: GithubApi
){
    fun getTopRepos():List<RepoApiModel>{
        return githubApi.getTopRepositories()
    }
}