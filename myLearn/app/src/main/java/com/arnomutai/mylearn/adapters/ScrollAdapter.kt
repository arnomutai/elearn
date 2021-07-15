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
import com.arnomutai.mylearn.models.scrollData

class ScrollAdapter (
    var context: Context
): RecyclerView.Adapter<ScrollAdapter.ItemViewHolder>() {

    var datalistModel = ArrayList<scrollData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.scrolllayout, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount() = datalistModel.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        var data = datalistModel[position]

        holder.title.text = data.title
        holder.desc.text = data.desc
        holder.image.setImageResource(data.image)
    }
    internal fun setDataList2(dataListModel : ArrayList<scrollData>){
        this.datalistModel = dataListModel
        notifyDataSetChanged()
    }

    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.image2)
        var title: TextView = itemView.findViewById(R.id.text_title2)
        var desc: TextView = itemView.findViewById(R.id.text_desc2)

        init {
            itemView.setOnClickListener {
                this
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "you clicked me ${position + 1}", Toast.LENGTH_SHORT).show()
            }
        }
    }




}