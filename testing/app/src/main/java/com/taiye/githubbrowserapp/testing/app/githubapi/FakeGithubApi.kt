package com.taiye.githubbrowserapp.testing.app.githubapi

import com.taiye.githubbrowserapp.githubapi.GithubApi
import com.taiye.githubbrowserapp.githubapi.TopRepoSearchResult
import com.taiye.githubbrowserapp.githubapi.model.RepoApiModel
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class FakeGithubApi @Inject constructor(): GithubApi {


    var repos = listOf<RepoApiModel>()

    override suspend fun getTopRepositories(): TopRepoSearchResult {
       return  TopRepoSearchResult(repos)
    }
}