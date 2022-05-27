package com.example.binar_suit_chp6.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.binar_suit_chp6.R

class MainActivity : AppCompatActivity() {

    private val peopleList = listOf<People>(
        People("ucup", 31),
        People("reza", 44),
        People("jisung", 18),
        People("mark", 30),
        People("aries", 22),
        People("renjung", 23,),
        People("perik",33)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peopleRecyclerView : RecyclerView = findViewById(R.id.main_rv)
        val peopleLayoutManager = LinearLayoutManager(this)
        val peopleAdapter = PeopleAdapter()
        val peopleEtAdded: EditText = findViewById(R.id.main_et_add)
        val peopleButton: Button = findViewById(R.id.button)

        peopleRecyclerView.layoutManager = peopleLayoutManager
        peopleRecyclerView.adapter = peopleAdapter

        peopleAdapter.addList(peopleList)

        peopleButton.setOnClickListener{
            val nameEdit = peopleEtAdded.text.toString()
            val randomAge = (10..40).random()

            val people= People(nameEdit,randomAge)
            peopleAdapter.addItem(people)

            val sizePeople = peopleAdapter.itemCount - 1
            peopleRecyclerView.scrollToPosition(sizePeople)
        }
    }
}