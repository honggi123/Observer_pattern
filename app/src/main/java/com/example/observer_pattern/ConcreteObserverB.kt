package com.example.observer_pattern

import android.util.Log

class ConcreteObserverB : Observer {

    override fun update(s: String) {
        Log.d("ConcreteObserverB",s)
    }

}