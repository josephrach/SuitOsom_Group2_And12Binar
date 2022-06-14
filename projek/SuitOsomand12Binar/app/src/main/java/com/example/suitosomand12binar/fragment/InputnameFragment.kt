package com.example.suitosomand12binar.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.suitosomand12binar.R
import com.example.suitosomand12binar.database.PermainanDatabase

class InputnameFragment: Fragment(R.layout.fragment_inputp1) {
    lateinit var namaPemain: String
    private val permainanDatabase: PermainanDatabase? by lazy {
        PermainanDatabase.getInstance(.In)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun inputNama(){
        val etNama = view?.findViewById<EditText>(R.id.et_nama)
        val btnSubmit = view?.findViewById<Button>(R.id.btn_submit)

        btnSubmit?.setOnClickListener(){
            namaPemain = etNama?.text.toString()
        }
    }
}