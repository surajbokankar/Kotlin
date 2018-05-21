package com.example.surajbokankar.collection

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatTextView
import android.view.View
import com.example.surajbokankar.collection.model.UserModel

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(),View.OnClickListener {


    lateinit var textFor: AppCompatTextView
    lateinit var textWhile: AppCompatTextView
    lateinit var textForEach:AppCompatTextView
    lateinit var textList:AppCompatTextView
    lateinit var textCustomList:AppCompatTextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       intiViews()

       setClickListener()



    }

    private fun setClickListener() {
        textFor.setOnClickListener(this)
        textWhile.setOnClickListener(this)
        textForEach.setOnClickListener(this)
        textCustomList.setOnClickListener(this)
        textList.setOnClickListener(this)
    }

    private fun intiViews() {
        textFor=findViewById<AppCompatTextView>(R.id.loop_for)
        textWhile=findViewById<AppCompatTextView>(R.id.loop_while)
        textForEach=findViewById<AppCompatTextView>(R.id.loop_for_each)
        textList=findViewById<AppCompatTextView>(R.id.loop_list)
        textCustomList=findViewById<AppCompatTextView>(R.id.loop_list_custom)
    }

    override fun onClick(view: View?) {
        when (view!!.id){
             R.id.loop_for ->{
                 callForLoop()
             }
            R.id.loop_while ->{
                callWhileLoop()
            }
            R.id.loop_for_each ->{
                callForEachLoop()
            }
            R.id.loop_list_custom ->{
                getCustomModelList()
            }
            R.id.loop_list ->{
                getList()
            }
        }
    }

    private fun getList() {
        var list= arrayListOf<String>()
        for (i in 0 until 10){
            list.add("Item"+i)
        }

        println("List="+list.get(0))
    }

    private fun callForEachLoop() {

        var daysOfWeek = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")

        daysOfWeek.forEach {
            println(it);
        }

    }

    private fun callWhileLoop() {
        var num=1
        while (num<=10){
          println("While Loop="+num)
            num++
        }
    }

    private fun callForLoop() {
        var num=12
        for(i in 0 until num){
            println("For Loop="+i)
        }
    }


    private fun getCustomModelList() {
        var list= arrayListOf<UserModel>()

        var item1=UserModel()
        item1.name="Sunday"

        list.add(item1)

        var item2=UserModel()
        item2.name="Monday"
        list.add(item2)


        var item3=UserModel()
        item3.name="Tuesday"
        list.add(item3)

        list.forEach {
            println(it.name);
        }

    }


}
