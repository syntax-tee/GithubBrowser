package com.taiye.githubbrowserapp.di.viewmodel

import kotlin.reflect.KClass

annotation  class ViewModelKey(val classKey: KClass<out ViewModelKey>)