package com.taiye.githubbrowserapp.githubapi

import com.squareup.moshi.JsonClass
import com.taiye.githubbrowserapp.githubapi.model.RepoApiModel


@JsonClass(generateAdapter =  true)
data class TopRepoSearchResult(val items: List<RepoApiModel>)