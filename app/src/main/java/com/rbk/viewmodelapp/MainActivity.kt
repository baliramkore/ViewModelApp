package com.rbk.viewmodelapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var count:Int=0
    lateinit var textCounter:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textCounter=findViewById(R.id.textView)

    }

    fun increment(view: View) {
        count++
        setText()

    }

    private fun setText() {
        textCounter.text=count.toString()
    }
}