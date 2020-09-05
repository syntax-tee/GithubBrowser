package com.taiye.appcomponent

import android.content.Context
import com.taiye.githubappbrowser.appdeps.ApplicationDeps
import com.taiye.githubbrowserapp.githubapi.GithubApiModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [GithubApiModule::class])
interface ApplicationComponent : ApplicationDeps {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}