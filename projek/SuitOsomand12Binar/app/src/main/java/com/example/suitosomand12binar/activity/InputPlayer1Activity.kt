package com.example.suitosomand12binar.activity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.suitosomand12binar.R
import com.example.suitosomand12binar.database.PermainanDatabase
import com.example.suitosomand12binar.databinding.ActivityMainBinding

class InputPlayer1Activity: AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private lateinit var binding: ActivityMainBinding

    lateinit var namaPemain: String
    private val permainanDatabase: PermainanDatabase? by lazy {
        PermainanDatabase.getInstance(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        binding = requireNotNull(_binding)
        setContentView(binding.root)

    }

    fun inputNama(){
        val etNama = findViewById<EditText>(R.id.et_nama)
        val btnSubmit = findViewById<Button>(R.id.btn_submit)

        btnSubmit?.setOnClickListener(){
            namaPemain = etNama?.text.toString()
        }
    }
}