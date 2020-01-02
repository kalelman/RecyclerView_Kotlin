package com.kalelman.recyclerview_kotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kalelman.recyclerview_kotlin.R

class ListSelectionRecyclerViewAdapter: RecyclerView.Adapter<ListSelectionViewHolder>() {

    private val listTitles = arrayOf("Shopping list", "Chores", "Android Tutorials"
        , "Python Tutorials", "C++ Tutorials", "Java Tutorials", "Kotlin Tutorials", "C++ Tutorials"
        , "Swift Tutorials", "iOS Tutorials", "Machine Learning Tutorials", "JavaScript Tutorials"
        , "CSS Tutorials" , "HTML Tutorials")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_selection_view_holder, parent, false)

        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTitles.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.listPosition.text = (position + 1).toString()
        holder.listTitle.text = listTitles[position]
    }
}