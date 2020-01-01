package com.kalelman.recyclerview_kotlin.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kalelman.recyclerview_kotlin.R

class ListSelectionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val listPosition = itemView.findViewById(R.id.itemNumber) as TextView
    val listTitle = itemView.findViewById(R.id.itemString) as TextView
}