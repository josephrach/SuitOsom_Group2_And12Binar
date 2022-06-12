package com.example.suitosomand12binar.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.suitosomand12binar.R
import com.example.suitosomand12binar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun ambilBtn(){

    }
}