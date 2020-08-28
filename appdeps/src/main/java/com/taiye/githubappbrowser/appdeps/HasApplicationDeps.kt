package com.taiye.githubappbrowser.appdeps

import android.content.Context
import java.lang.IllegalArgumentException

interface HasApplicationDeps {

    fun getApplicationDeps():ApplicationDeps
}


fun Context.applicationDeps(): ApplicationDeps{
    return (applicationContext as? HasApplicationDeps)?.getApplicationDeps()
        ?: throw IllegalArgumentException("Application must implement HasApplication deps")
}