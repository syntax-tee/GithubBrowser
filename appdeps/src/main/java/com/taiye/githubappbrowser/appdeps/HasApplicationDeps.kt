package com.taiye.githubappbrowser.appdeps

import android.content.Context
import java.lang.IllegalArgumentException

interface HasApplicationDeps {

    fun getApplicationDeps(): ApplicationDeps
}