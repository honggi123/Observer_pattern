package com.example.observer_pattern

class ConcreteSubject : Subject {

    var observers : MutableList<Observer>
    var word : String

    constructor(w : String){
        observers = mutableListOf()
        word = w
    }

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for(o : Observer in observers){
            o.update(word)
        }
    }

    fun setData(s:String){
        word = s
        notifyObservers()
    }


}