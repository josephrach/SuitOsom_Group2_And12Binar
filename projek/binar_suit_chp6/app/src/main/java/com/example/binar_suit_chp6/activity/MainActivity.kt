package com.example.binar_suit_chp6.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.binar_suit_chp6.R

class MainActivity : AppCompatActivity() {

    val image = getDrawable(0)
    private val peopleList = listOf<People>(
        People("ucup", 31,this.image),
        People("reza", 44,image),
        People("jisung", 18,image),
        People("mark", 30,image),
        People("aries", 22,image),
        People("renjung", 23,image),
        People("perik",33,image)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peopleRecyclerView : RecyclerView = findViewById(R.id.main_rv)
        val peopleLayoutManager = LinearLayoutManager(this)
        val peopleAdapter = PeopleAdapter(peopleList)

        peopleRecyclerView.layoutManager = peopleLayoutManager
        peopleRecyclerView.adapter = peopleAdapter
    }
}