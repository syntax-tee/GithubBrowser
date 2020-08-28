package com.taiye.githubappbrowser.appdeps

import com.taiye.githubbrowserapp.repository.AppRepository


interface ApplicationDeps {
    fun appRepository(): AppRepository
}