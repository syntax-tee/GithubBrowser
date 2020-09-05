package com.taiye.githubbrowserapp.application

import android.app.Application
import com.taiye.appcomponent.DaggerApplicationComponent
import com.taiye.githubappbrowser.appdeps.ApplicationDeps
import com.taiye.githubappbrowser.appdeps.HasApplicationDeps

class GithubBrowserApp:Application(),HasApplicationDeps {

    private val appComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

    override fun getApplicationDeps(): ApplicationDeps {
        return appComponent
    }

}
