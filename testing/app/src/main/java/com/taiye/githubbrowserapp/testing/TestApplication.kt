package com.taiye.githubbrowserapp.testing

import android.app.Application
import androidx.test.platform.app.InstrumentationRegistry
import com.taiye.githubappbrowser.appdeps.ApplicationDeps
import com.taiye.githubappbrowser.appdeps.HasApplicationDeps

class TestApplication: Application(), HasApplicationDeps {


    companion object{
        val component: TestApplicationComponent
            get() =  (InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as TestApplication).component
    }

    private  lateinit var  component: TestApplicationComponent


    override fun onCreate() {
        super.onCreate()
       component = DaggerTestApplicationComponent.factory().create(this)
    }


    override fun getApplicationDeps(): ApplicationDeps {
      return component
    }
}