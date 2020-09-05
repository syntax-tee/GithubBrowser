package com.taiye.githubbrowserapp.testing.app.githubapi

import com.taiye.githubbrowserapp.githubapi.GithubApi
import dagger.Binds
import dagger.Module

@Module
interface TestGithubApiModule {

    @Binds
    fun bindGithubApi(fakeGithubApi: FakeGithubApi): GithubApi

}