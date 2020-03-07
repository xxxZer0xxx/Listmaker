package com.maxreed.listmaker

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class TodoListFragment : Fragment() {
    private lateinit var todoListRecyclerView: RecyclerView
    private lateinit var listDataManager: ListDataManager
}