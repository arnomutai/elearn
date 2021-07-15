package com.arnomutai.mylearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arnomutai.mylearn.adapters.ItemAdapter
import com.arnomutai.mylearn.models.ItemModel
import java.util.ArrayList

class detailsActivity : AppCompatActivity() {

    var imageArray: ArrayList<Int> = ArrayList()

    private lateinit var recyclerView1: RecyclerView
    private lateinit var itemAdapter: ItemAdapter
    private var datalistModel = arrayListOf<ItemModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        recyclerView1 = findViewById(R.id.recycler_view1)
        recyclerView1.layoutManager = LinearLayoutManager(this)
        itemAdapter = ItemAdapter(applicationContext)
        recyclerView1.adapter = itemAdapter

        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)

        datalistModel.add(ItemModel("title", "desc", R.drawable.learn1))
        datalistModel.add(ItemModel("title", "desc", R.drawable.learn))
        datalistModel.add(ItemModel("title", "desc", R.drawable.learn1))
        datalistModel.add(ItemModel("title", "desc", R.drawable.learn))
        datalistModel.add(ItemModel("title", "desc", R.drawable.learn1))
        datalistModel.add(ItemModel("title", "desc", R.drawable.learn))

        itemAdapter.setDataList1(datalistModel)
    }
}