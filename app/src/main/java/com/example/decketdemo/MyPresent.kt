package com.example.decketdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyPresent : LifecycleObserver {

    @OnLifecycleEvent(value = Lifecycle.Event.ON_RESUME)
    fun onConnect() {
        Log.i("陈立中", "onConnect: ")
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_PAUSE)
    fun onDisConnect() {
        Log.i("陈立中", "onDisConnect: ")
    }

}