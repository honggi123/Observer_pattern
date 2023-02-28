package com.example.observer_pattern

interface Subject {

    fun registerObserver(o : Observer)

    fun removeObserver(o : Observer)

    fun notifyObservers()

}