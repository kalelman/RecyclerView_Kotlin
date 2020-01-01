package com.kalelman.recyclerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kalelman.recyclerview_kotlin.adapter.ListSelectionRecyclerViewAdapter

class MainActivity : AppCompatActivity() {

    lateinit var listsRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listsRecyclerView = findViewById(R.id.list_recycler_view)

        listsRecyclerView.layoutManager = LinearLayoutManager(this)

        listsRecyclerView.adapter = ListSelectionRecyclerViewAdapter()
    }
}
