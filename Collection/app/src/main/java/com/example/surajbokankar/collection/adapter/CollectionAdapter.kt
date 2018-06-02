package com.example.surajbokankar.collection.adapter

import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.surajbokankar.collection.R
import com.example.surajbokankar.collection.adapter.CollectionAdapter.ViewHolder
import com.example.surajbokankar.collection.callback.CollectionCallBack
import kotlinx.android.synthetic.main.layout_item_content.view.*

/**
 * Created by suraj.bokankar on 22/05/18.
 */
class CollectionAdapter(var list:ArrayList<String>,var listener:CollectionCallBack):RecyclerView.Adapter<ViewHolder>(){
    var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        context= parent?.context
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_item_content,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        if(holder!=null&&list!=null){
           holder.text.setText(list[position])

            holder.text.setOnClickListener(View.OnClickListener {
                listener.onRowClick(position)
            })

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var text=itemView.row_text
    }
}