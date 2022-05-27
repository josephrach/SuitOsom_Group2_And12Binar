package com.example.binar_suit_chp6.activity

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.binar_suit_chp6.R

class PeopleViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(people: People){
        val tvName :TextView = itemView.findViewById(R.id.item_tv_name)
        val tvAge :TextView = itemView.findViewById(R.id.item_tv_age)
        val tvImage :ImageView = itemView.findViewById(R.id.item_tv_image)

        tvName.text = people.name
        tvAge.text = people.age.toString()
        tvImage.resources.
    }
}