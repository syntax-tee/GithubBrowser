package com.taiye.githubbrowserapp.githubapi

import com.taiye.githubbrowserapp.githubapi.model.RepoApiModel
import com.taiye.githubbrowserapp.githubapi.model.UserApiModel
import javax.inject.Inject
import javax.inject.Singleton

interface GithubApi {
     suspend  fun getTopRepositories(): TopRepoSearchResult
}

@Singleton
class MockGitHubApi @Inject constructor():GithubApi{
    override suspend fun getTopRepositories():TopRepoSearchResult {
        return TopRepoSearchResult(listOf(
            RepoApiModel(
                id = 1L,
                name = "Mock Repo 1",
                description = "Mock Repo Description",
                owner = UserApiModel(1L, "Taiye"),
                stargazersCount = 1,
                forksCount = 1,
                contributorsUrl = "",
                createdDate = "1/1/2020",
                updatedDate = "1/1/2020"
            ),
            RepoApiModel(
                id = 1L,
                name = "Mock Repo 1",
                description = "Mock Repo Description",
                owner = UserApiModel(1L, "Taiye"),
                stargazersCount = 1,
                forksCount = 1,
                contributorsUrl = "",
                createdDate = "1/1/2020",
                updatedDate = "1/1/2020"
            )
        ))
    }

}