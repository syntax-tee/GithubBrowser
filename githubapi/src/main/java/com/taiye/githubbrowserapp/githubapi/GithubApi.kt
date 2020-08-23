package com.taiye.githubbrowserapp.githubapi

import com.taiye.githubbrowserapp.githubapi.model.RepoApiModel
import com.taiye.githubbrowserapp.githubapi.model.UserApiModel
import javax.inject.Inject
import javax.inject.Singleton

interface GithubApi {
     fun getTopRepositories(): List<RepoApiModel>
}

@Singleton
class MockGitHubApi @Inject constructor():GithubApi{
    override fun getTopRepositories(): List<RepoApiModel> {
        return  listOf(
            RepoApiModel(
                id = 1L,
                name = "Mock Repo",
                description =  "Mock Repo Description",
                owner = UserApiModel(1L,"Taiye"),
                stargazersCount = 1,
                forksCount = 1,
                contributorsUrl = "",
                createdData =  "1/1/2020",
                updatedDate =  "1/1/2020"


            )
        )
    }

}