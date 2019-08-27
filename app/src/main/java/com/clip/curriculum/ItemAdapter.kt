package com.clip.curriculum

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recycler_item.view.*

class ItemAdapter(var c : Context, var lists : ArrayList<Item>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        var v = LayoutInflater.from(c).inflate(R.layout.recycler_item, p0, false)
        return Items(v)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        (p0 as Items).bindData(lists[p1])
    }

    class Items(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bindData(_list : Item){
            itemView.textView.text = _list.title
            itemView.textView2.text = _list.text
        }
    }

}