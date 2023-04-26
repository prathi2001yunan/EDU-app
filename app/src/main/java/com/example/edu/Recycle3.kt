package com.example.edu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.edu.databinding.Recyclebackup3Binding


class Recycle3(val listn:List<Kotlin111>): RecyclerView.Adapter<Recycle3.MainHolder>() {
    inner class MainHolder(val itembinding:Recyclebackup3Binding):RecyclerView.ViewHolder(itembinding.root){
        fun task(task:Kotlin111){
            itembinding.textView6.text=task.nam
            itembinding.img1.setImageResource(task.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(Recyclebackup3Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return listn.size
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val model = listn[position]
        holder.task(model)
    }
}