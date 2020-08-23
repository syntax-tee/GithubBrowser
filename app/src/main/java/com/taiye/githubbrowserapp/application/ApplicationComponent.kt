package com.taiye.githubbrowserapp.application

import android.content.Context
import com.taiye.githubbrowserapp.githubapi.GithubApiModule
import com.taiye.githubbrowserapp.repository.AppRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [GithubApiModule::class])
interface ApplicationComponent {

    fun appRepository(): AppRepository

    @Component. Factory
    interface  Factory {
        fun create(@BindsInstance context: Context):ApplicationComponent
    }

}