package com.example.decketdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class MyPresent : LifecycleObserver {

    private var mView: IView? = null


    public fun setOnViewState(view: IView) {
        mView = view
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_START)
    fun onConnect(owner: LifecycleOwner) {
        Log.i("陈立中", "onConnect: ")
        if (owner.lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            mView?.showView()
        }
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_PAUSE)
    fun onDisConnect() {
        Log.i("陈立中", "onDisConnect: ")
        mView?.closeView()
    }

}