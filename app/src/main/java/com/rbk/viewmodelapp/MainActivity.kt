package com.rbk.viewmodelapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    //var count:Int=0
    lateinit var textCounter:TextView
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel= ViewModelProvider(this).get(MainViewModel::class.java);
        textCounter=findViewById(R.id.textView)
        setText()


    }


    // separating logical and data related things inside viewmodel
    fun increment(view: View) {
        //count++
        mainViewModel.increment()
        setText()

    }

    private fun setText() {
       // textCounter.text=count.toString()
        textCounter.text=mainViewModel.count.toString()


    }
}