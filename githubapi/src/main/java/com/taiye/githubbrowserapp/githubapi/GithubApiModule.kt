package com.taiye.githubbrowserapp.githubapi

import dagger.Binds
import dagger.Module


@Module
interface GithubApiModule {

    @Binds
    fun bindsGithubApi(mockGitHubApi: MockGitHubApi):GithubApi
}