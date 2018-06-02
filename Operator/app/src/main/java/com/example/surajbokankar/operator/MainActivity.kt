package com.example.surajbokankar.operator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Console

class MainActivity : AppCompatActivity(),View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {

        ope_dot.setOnClickListener(this)
        ope_down.setOnClickListener(this)
        ope_in.setOnClickListener(this)
        ope_range.setOnClickListener(this)



    }
    override fun onClick(view: View?) {
        when(view!!.id){

            R.id.ope_in ->{
              //Contains operator

                checkValueIn();

            }

            R.id.ope_dot ->{
               //Create Range
                createClosedRange()

            }

            R.id.ope_down ->{
                //Create Down range from 20 to lower.
              createDownRange()
            }

            R.id.ope_range ->{
               //Dynamic Range using rangeTo() function
                dynamicRange()
            }
        }
    }

    private fun createDownRange() {

        val downValue=user_input.text.toString().toInt()
        val range=20.downTo(downValue);
        for (i in range){
            Toast.makeText(this,"Down Range Using DownTo Upto "+downValue+":"+i,Toast.LENGTH_SHORT).show()
        }

    }

    private fun dynamicRange() {

        val  value=user_input.text.toString().toInt()
        val range=1.rangeTo(value)
        for (i in range){
            Toast.makeText(this,"Dynamic Range Using RangeTo:"+i,Toast.LENGTH_SHORT).show()
        }

    }

    private fun createClosedRange() {

        val item:Int = user_input.text.toString().toInt()

        val value=1..item

        for( i in value){
            Toast.makeText(this,"Dynamic Range:"+i,Toast.LENGTH_SHORT).show()
        }

    }

    private fun checkValueIn() {

      val  item=user_input.text.toString()
      val  list= arrayOf("dummy","dumpy","suraj","id","sam")

        if(item in list){
            Toast.makeText(this,"Contains Given String",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"Not Contains Given String",Toast.LENGTH_SHORT).show()
        }
    }
}
