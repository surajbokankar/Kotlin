package com.example.surajbokankar.extensions

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_item_list.view.*

/**
 * Created by suraj.bokankar on 20/05/18.
 */
class ListAdapter(var list:ArrayList<String>,var context:Context): RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        if(list!=null&&list.size>0)   {
            var value=list.get(position)
            if (holder != null) {
                holder.animalType.setText(value)
            }
        }


    }


    override fun getItemCount(): Int {
        return list.size
    }



    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListAdapter.ViewHolder? {
        context= parent!!.context
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_item_list,parent,false))
    }


    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val animalType=view.tv_animal_type
        // Holds the TextView that will add each animal to
    }

}