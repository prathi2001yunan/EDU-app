package com.example.edu


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.edu.databinding.Recyclebackup1Binding

class Recycle2(val listn : List<Kotlin1>):RecyclerView.Adapter<Recycle2.MainAdapter1>() {
    inner class MainAdapter1(val itembinding: Recyclebackup1Binding):RecyclerView.ViewHolder(itembinding.root){
        fun task(task:Kotlin1){
           itembinding.textView2.text=task.text1
            itembinding.textView3.text=task.text2


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter1 {
        return MainAdapter1(Recyclebackup1Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return listn.size
    }

    override fun onBindViewHolder(holder: MainAdapter1, position: Int) {
        val n1 = listn[position]
        holder.task(n1)
    }
}
