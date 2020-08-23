package com.taiye.githubbrowserapp.applicaton

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component
interface ApplicationComponent {

    @Component.Factory
    interface  Factory {
        fun create(@BindsInstance context: Context):ApplicationComponent
    }

}