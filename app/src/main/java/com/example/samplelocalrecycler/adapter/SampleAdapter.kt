package com.example.samplelocalrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.samplelocalrecycler.R
import com.example.samplelocalrecycler.modal.Sheets
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.item_list.view.*

class SampleAdapter(private val dataSheets: ArrayList<Sheets>): RecyclerView.Adapter<SampleAdapter.SampleHolder>()
{
    inner class SampleHolder(view: View): RecyclerView.ViewHolder(view)
    {
        var imageSample: CircleImageView = view.findViewById(R.id.circle_image)
        var titleSample: TextView = view.findViewById(R.id.title_sample)
        var descSample: TextView = view.findViewById(R.id.desc_sample)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleHolder
    {
        val layoutInflater = LayoutInflater.from(parent.context)
        val inflaterView = layoutInflater.inflate(R.layout.item_list, parent, false)

        return SampleHolder(inflaterView)
    }

    override fun onBindViewHolder(holder: SampleHolder, position: Int)
    {
        //
        val data = dataSheets[position]

        //
        Glide.with(holder.itemView.context)
            .load(data.image)
            .into(holder.imageSample)

        holder.titleSample.text = data.title
        holder.descSample.text = data.desc

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "You Choose ${data.title}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int
    {
        return dataSheets.size
    }


}