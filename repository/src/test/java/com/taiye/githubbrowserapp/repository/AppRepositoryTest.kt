package com.taiye.githubbrowserapp.repository

import com.google.common.truth.Truth.assertThat
import com.taiye.githubbrowserapp.githubapi.GithubApi
import com.taiye.githubbrowserapp.githubapi.model.RepoApiModel
import com.taiye.githubbrowserapp.githubapi.model.UserApiModel
import org.junit.Before
import org.junit.Test

private val fakeRepoApiModel = RepoApiModel(
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


class AppRepositoryTest {
    private lateinit var appRepository: AppRepository

    private val fakeGithubApi = FakeGithubApi()

    @Before
    fun setUp(){
        appRepository = AppRepository(fakeGithubApi)
    }


    @Test
    fun testSuccessfulQuery(){
        val topRepos  = appRepository.getTopRepos()

       assertThat(topRepos[0]).isEqualTo(fakeRepoApiModel)
        assertThat(topRepos.size).isEqualTo(1)

    }


}

private  class FakeGithubApi: GithubApi {

    override fun getTopRepositories(): List<RepoApiModel> {
        return  listOf(fakeRepoApiModel)
    }

}