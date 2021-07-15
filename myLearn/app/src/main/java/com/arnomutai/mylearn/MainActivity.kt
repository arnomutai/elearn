
package com.arnomutai.mylearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arnomutai.mylearn.adapters.PhotoAdapter
import com.arnomutai.mylearn.adapters.ScrollAdapter
import com.arnomutai.mylearn.models.DataModel
import com.arnomutai.mylearn.models.scrollData
import com.arnomutai.mylearn.ui.LoginActivity
import com.arnomutai.mylearn.ui.activityRegister
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener
import java.util.ArrayList

class MainActivity : AppCompatActivity(), PhotoAdapter.OnItemClickListener {

    var imageArray: ArrayList<Int> = ArrayList()
    var carouselView: CarouselView? = null

    private lateinit var recyclerView1: RecyclerView
    private lateinit var scrollAdapter: ScrollAdapter
    private var datalistModel = arrayListOf<scrollData>()
    private lateinit var button: Button
    private lateinit var btn : Button
    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var datalist = arrayListOf<DataModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 3)
        photoAdapter = PhotoAdapter(applicationContext, this)
        recyclerView.adapter = photoAdapter


        recyclerView1 = findViewById(R.id.recycler_view2)
        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        scrollAdapter = ScrollAdapter(applicationContext)
        recyclerView1.adapter = scrollAdapter

        button = findViewById(R.id.btn_signin)
        btn = findViewById(R.id.btn_signup)


        fun clickMe(){
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        }
        fun clickMe1(){
            startActivity(Intent(this@MainActivity, activityRegister::class.java))
        }

        button.setOnClickListener {
          clickMe()
        }
        btn.setOnClickListener {
            clickMe1()
        }



        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        imageArray.add(R.drawable.learn1)
        imageArray.add(R.drawable.learn)
        datalist.add(DataModel("title", "desc", R.drawable.learn1))
        datalist.add(DataModel("title1", "desc", R.drawable.learn))
        datalist.add(DataModel("title2", "desc", R.drawable.learn1))
        datalist.add(DataModel("title4", "desc", R.drawable.learn))
        datalist.add(DataModel("title", "desc", R.drawable.learn1))
        datalist.add(DataModel("title", "desc", R.drawable.learn))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn1))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn1))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn1))
        datalistModel.add(scrollData("title", "desc", R.drawable.learn))

        scrollAdapter.setDataList2(datalistModel)



        carouselView = findViewById(R.id.carouselView)
        carouselView!!.pageCount =  imageArray.size
        carouselView!!.setImageListener(imageListener)

        photoAdapter.setDataList(datalist)
    }
    var imageListener = ImageListener { position, imageView -> imageView.setImageResource(imageArray[position]) }
    override fun onItemClick(dataList : DataModel) {
        var dataModel1 = dataList
        var name = dataModel1.title

        when(name){
            "title" ->
                startActivity(Intent(this@MainActivity, detailsActivity::class.java))
            "title1" ->
                startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            "title4" ->
                startActivity(Intent(this@MainActivity, activityRegister::class.java))
        }
    }


}