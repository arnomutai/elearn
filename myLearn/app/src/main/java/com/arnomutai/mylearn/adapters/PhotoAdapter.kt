package com.arnomutai.mylearn.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.arnomutai.mylearn.R
import com.arnomutai.mylearn.models.DataModel

class PhotoAdapter(
        val context: Context,
        private val listener: OnItemClickListener
): RecyclerView.Adapter<PhotoAdapter.ViewHolder>(){

    //var dataList = emptyList<DataModel>()
    var datalist = ArrayList<DataModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.photolayout, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = datalist.size

    interface OnItemClickListener{
        fun onItemClick(dataModel: DataModel)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = datalist[position]

        holder.title.text = data.title
        holder.desc.text = data.desc
        holder.image.setImageResource(data.image)

        holder.itemView.setOnClickListener {
            listener.onItemClick(data)
        }
    }

    internal fun setDataList(dataList : ArrayList<DataModel>){
        this.datalist = dataList
        notifyDataSetChanged()
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var image: ImageView = itemView.findViewById(R.id.image)
        var title: TextView = itemView.findViewById(R.id.text_title)
        var desc: TextView = itemView.findViewById(R.id.text_desc)

        init {
            itemView.setOnClickListener { this
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "you clicked me ${position + 1}", Toast.LENGTH_SHORT).show()
            }
        }



    }

}




