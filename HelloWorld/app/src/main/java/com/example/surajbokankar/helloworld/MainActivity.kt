package com.example.surajbokankar.helloworld

import android.annotation.SuppressLint
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatButton
import android.support.v7.widget.AppCompatTextView
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var print: AppCompatButton? = null
    private var textView: AppCompatTextView?=null
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        //var printButton:AppCompatButton=findViewById<R.id.>()

        print = findViewById<AppCompatButton>(R.id.demo_button) as AppCompatButton

        textView=findViewById<AppCompatTextView>(R.id.text_view) as AppCompatTextView

        print!!.setOnClickListener(View.OnClickListener {


            if (textView != null) {
                textView!!.setText("Hello World Kotlin")
            }

        })

    }
}
