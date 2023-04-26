package com.example.edu
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


import com.example.edu.databinding.RecyclebackupBinding

class Recycle1(val listn:List<Kotlin1>): RecyclerView.Adapter<Recycle1.MainAdapter>() {
    var itemClick:((Kotlin1)->Unit)?=null
    inner class MainAdapter(var unitbinding: RecyclebackupBinding):RecyclerView.ViewHolder(unitbinding.root){
        fun task(task:Kotlin1){
            unitbinding.tx1.text=task.text1
            unitbinding.tx2.text=task.text2


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter {
        return MainAdapter(RecyclebackupBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return listn.size
    }

    override fun onBindViewHolder(holder: MainAdapter, position: Int) {
        val act = listn[position]

        holder.task(act)
        holder.itemView.setOnClickListener{

            itemClick?.invoke(act)
        }

    }

}
