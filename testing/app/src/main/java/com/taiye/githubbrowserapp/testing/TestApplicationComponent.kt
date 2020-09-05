package com.taiye.githubbrowserapp.testing

import android.content.Context
import com.taiye.appcomponent.ApplicationComponent
import com.taiye.githubbrowserapp.testing.app.githubapi.FakeGithubApi
import com.taiye.githubbrowserapp.testing.app.githubapi.TestGithubApiModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules =  [TestGithubApiModule::class])
interface TestApplicationComponent : ApplicationComponent{


    fun githubApi(): FakeGithubApi

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): TestApplicationComponent
    }
}