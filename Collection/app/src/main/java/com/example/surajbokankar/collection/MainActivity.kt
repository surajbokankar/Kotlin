package com.example.surajbokankar.collection

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.surajbokankar.collection.adapter.CollectionAdapter
import com.example.surajbokankar.collection.callback.CollectionCallBack
import com.example.surajbokankar.collection.model.UserModel
import java.util.*

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(),View.OnClickListener,CollectionCallBack {



    lateinit var textFor: AppCompatTextView
    lateinit var textWhile: AppCompatTextView
    lateinit var textForEach:AppCompatTextView
    lateinit var textList:AppCompatTextView
    lateinit var textCustomList:AppCompatTextView
    lateinit var recyclerView:RecyclerView
     var list=ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       intiViews()

       //setClickListener()



    }

    /*private fun setClickListener() {
        textFor.setOnClickListener(this)
        textWhile.setOnClickListener(this)
        textForEach.setOnClickListener(this)
        textCustomList.setOnClickListener(this)
        textList.setOnClickListener(this)
    }*/

    private fun intiViews() {
        /*textFor=findViewById<AppCompatTextView>(R.id.loop_for)
        textWhile=findViewById<AppCompatTextView>(R.id.loop_while)
        textForEach=findViewById<AppCompatTextView>(R.id.loop_for_each)
        textList=findViewById<AppCompatTextView>(R.id.loop_list)
        textCustomList=findViewById<AppCompatTextView>(R.id.loop_list_custom)*/

        recyclerView=findViewById<RecyclerView>(R.id.collection_recycler)
        textFor=findViewById(R.id.list_text)


        list=getCollectionList()

        var linearLayout=LinearLayoutManager(this)
        var adapter=CollectionAdapter(list,this)
        recyclerView.layoutManager=linearLayout
        recyclerView.adapter=adapter




    }

    private fun getCollectionList(): ArrayList<String> {
        list.add(resources.getString(R.string.loop_for))
        list.add(resources.getString(R.string.loop_while))
        list.add(resources.getString(R.string.loop_for_each))
        list.add(resources.getString(R.string.list))
        list.add(resources.getString(R.string.list_custom))
        list.add(resources.getString(R.string.set))
        list.add(resources.getString(R.string.set_mutable))

        list.add(resources.getString(R.string.operator))

        return list




    }

    override fun onClick(view: View?) {
        /*when (view!!.id){
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
        }*/
    }

    private fun getList() {
        var values:Any?=null
        val sb = StringBuilder()
        var list= arrayListOf<String>()
        for (i in 0 until 10){
            //list.add("Item"+i)
            sb.append("Item"+i).append("\n")
        }

       textFor.setText("List="+sb.toString())
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
            textFor.setText("While Loop="+num)
            num++
        }
    }

    private fun callForLoop() {
        var num=12
        var sb=StringBuilder()
        for(i in 0 until num){
            sb.append(""+i).append("\n")
        }
        textFor.setText("For Loop="+sb)

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
            textFor.setText(it.name);
        }

    }


    override fun onRowClick(position: Int) {
        when (position) {
            0 -> {
                callForLoop()
            }
            1 -> {
                callWhileLoop()
            }
            2 -> {
                callForEachLoop()
            }
            3 -> {
                getList()
            }
            4 -> {
                getCustomModelList()
            }
            5 -> {
                getSet()
            }
            6 -> {
                getAllOperator()
            }
        }
    }

    private fun getSet() {
      var set= setOf("A","B","C","A")
        textFor.setText(set.toString())
    }


    private fun getAllOperator() {
        var set= setOf("A","B","C","A")
        textFor.setText(set.toString())
    }

}
