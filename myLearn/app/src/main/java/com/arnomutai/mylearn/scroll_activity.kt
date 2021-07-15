package com.arnomutai.mylearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arnomutai.mylearn.adapters.ScrollAdapter
import com.arnomutai.mylearn.models.scrollData
import java.util.ArrayList

class scroll_activity : AppCompatActivity() {

    var imageArray: ArrayList<Int> = ArrayList()

    private lateinit var recyclerView1: RecyclerView
    private lateinit var scrollAdapter: ScrollAdapter
    private var datalistModel = arrayListOf<scrollData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView1 = findViewById(R.id.recycler_view2)
        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        scrollAdapter = ScrollAdapter(applicationContext)
        recyclerView1.adapter = scrollAdapter

        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)

        datalistModel.add(scrollData("title", "desc", R.drawable.learn1))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn1))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn1))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn))

        scrollAdapter.setDataList2(datalistModel)
    }
}