package com.example.suitosomand12binar.fragment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.suitosomand12binar.R
import com.example.suitosomand12binar.activity.MainActivity
import com.example.suitosomand12binar.activity.ScreenSlidePagerActivity
import com.example.suitosomand12binar.database.PermainanDatabase

class InputnameFragment: Fragment(R.layout.activity_inputp1) {

    val acMain = MainActivity()
    val vPager = ScreenSlidePagerActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}