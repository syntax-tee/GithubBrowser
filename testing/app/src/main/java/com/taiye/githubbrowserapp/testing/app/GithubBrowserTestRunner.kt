package com.taiye.githubbrowserapp.testing.app

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import com.taiye.githubbrowserapp.testing.TestApplication

class GithubBrowserTestRunner: AndroidJUnitRunner() {
    override fun newApplication(
        cl: ClassLoader?,
        className: String?,
        context: Context?
    ): Application {
        return super.newApplication(cl, TestApplication::class.java.name, context)
    }
}