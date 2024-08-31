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
        //as we are calling ViewModelProvider we are able to pass parameters inside constructor hence
        //viewmodel factory concept is solving this problem to pass arguments inside constructor
        //mainViewModel= ViewModelProvider(this).get(MainViewModel::class.java);

        //sending parameter inside MainViewModelFactory(10) here default values as 10 which will update inside UI
        mainViewModel= ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java);

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