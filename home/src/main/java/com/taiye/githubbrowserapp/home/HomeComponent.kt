package com.taiye.githubbrowserapp.home

import com.taiye.githubappbrowser.appdeps.ApplicationDeps
import com.taiye.githubappbrowser.appdeps.applicationDeps
import dagger.Component


@Component(dependencies =  [ApplicationDeps::class], modules = [HomeModule::class])
interface HomeComponent{

     fun inject(homeFragment: HomeFragment)

    @Component.Factory
    interface  Factory{
        fun create(applicationDeps: ApplicationDeps): HomeComponent
    }
}


fun HomeFragment.inject(){
    DaggerHomeComponent.factory()
        .create(requireContext().applicationDeps())
        .inject(this)
}