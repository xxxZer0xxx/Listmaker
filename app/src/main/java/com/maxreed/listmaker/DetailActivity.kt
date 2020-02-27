package com.maxreed.listmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailActivity : AppCompatActivity() {

    lateinit var list: TaskList
    private lateinit var tasklistRecylerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        list = intent.getParcelableExtra(MainActivity.INTENT_LIST_KEY) as TaskList
        title = list.name

        tasklistRecylerView = findViewById(R.id.task_list_recycler_view)
        tasklistRecylerView.layoutManager = LinearLayoutManager(this)
        tasklistRecylerView.adapter = TaskListAdapter(list)
    }
}

// adapter for data source
// viewholder for displaying data