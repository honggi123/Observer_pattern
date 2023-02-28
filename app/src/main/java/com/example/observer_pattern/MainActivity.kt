package com.example.observer_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sub = ConcreteSubject("first word")
        sub.registerObserver(ConcreteObserverA())
        sub.registerObserver(ConcreteObserverB())

        sub.setData("second word")
        sub.setData("third word")
    }
}