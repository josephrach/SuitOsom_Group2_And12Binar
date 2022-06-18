package com.example.suitosomand12binar.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.suitosomand12binar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: LandingPageVpAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        binding = requireNotNull(_binding)
        setContentView(binding.root)

    }

    fun ambilBtn(){

    }
}