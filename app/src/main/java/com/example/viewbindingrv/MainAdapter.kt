package com.example.viewbindingrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindingrv.databinding.RecyclerviewItemBinding

class MainAdapter(val tasklist:List<Task>):RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    private var taskllist:ArrayList<Task>?=null
    private var mCurrentPosition: Int = 1
    inner class MainViewHolder(val itemBinding:RecyclerviewItemBinding)
        :RecyclerView.ViewHolder(itemBinding.root) {
            fun binditem(task:Task){
                itemBinding.titletv.text=task.title
                itemBinding.timetv.text=task.timestamp
/*
                itemBinding.imageIV.setImageResource(taskllist!![position()].getImage())
*/

            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewItemBinding.
        inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task=tasklist[position]
        holder.binditem(task)
    }

    override fun getItemCount(): Int {
        return tasklist.size
    }
    /*private fun position(): Int {
    var task: Task =taskllist!![mCurrentPosition-1]
        return
    }*/
}