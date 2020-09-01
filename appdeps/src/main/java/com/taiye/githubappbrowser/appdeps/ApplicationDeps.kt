package com.taiye.githubappbrowser.appdeps

import android.app.Application
import android.content.Context
import com.taiye.githubbrowserapp.repository.AppRepository

interface ApplicationDeps {

    fun appRepository(): AppRepository
}

fun Context.applicationDeps(): ApplicationDeps {
    return (applicationContext as? HasApplicationDeps)?.getApplicationDeps()
        ?: throw IllegalArgumentException("Application must implement HasApplicationDeps")
}