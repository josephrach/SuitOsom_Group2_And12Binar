package com.example.binar_suit_chp6_sp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.binar_suit_chp6_sp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val _binding: ActivityMainBinding? = null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}