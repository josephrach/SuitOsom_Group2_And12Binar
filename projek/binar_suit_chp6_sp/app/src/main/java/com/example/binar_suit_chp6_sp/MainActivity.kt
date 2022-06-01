package com.example.binar_suit_chp6_sp

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.binar_suit_chp6_sp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private lateinit var binding: ActivityMainBinding

    private val sharedPreferences: SharedPreferences by lazy {
        getSharedPreferences("user", Context.MODE_PRIVATE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        _binding = ActivityMainBinding.inflate(layoutInflater)
        binding = requireNotNull(_binding)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadData()
        val btnSave = binding.btnSave
        btnSave.setOnClickListener{
            saveData()
            loadData()
        }
    }

    private fun saveData(){
        val binding= this.binding

        val etName = binding.etName
        val switcher = binding.swSave
        val insertText: String = etName.text.toString()

        val sharedPreferences:SharedPreferences = getSharedPreferences("sharedPref",Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.apply{
            putString("STRING_KEY",insertText)
            putBoolean("BOOLEAN_KEY",switcher.isChecked)
        }.apply()

        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show()
    }

    private fun loadData(){
        val sharedPreferences:SharedPreferences = getSharedPreferences("sharedPref",Context.MODE_PRIVATE)
        val savedString: String? = sharedPreferences.getString("STRING_KEY",null)
        val savedBoolean: Boolean = sharedPreferences.getBoolean("BOOLEAN_KEY",false)

        val tvString = binding.tvNameAge
        val swSaved = binding.swSave

        tvString.text = savedString
        swSaved.isChecked = savedBoolean
    }
}