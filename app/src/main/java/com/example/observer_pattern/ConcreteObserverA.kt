package com.example.observer_pattern

import android.util.Log

class ConcreteObserverA : Observer {

    override fun update(s: String) {
        Log.d("ConcreteObserverA",s)
    }

}