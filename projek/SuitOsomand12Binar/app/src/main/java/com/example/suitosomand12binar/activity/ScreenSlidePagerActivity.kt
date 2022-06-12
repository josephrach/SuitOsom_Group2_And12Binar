package com.example.suitosomand12binar.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.suitosomand12binar.R
import com.example.suitosomand12binar.fragment.InputnameFragment
import com.example.suitosomand12binar.fragment.Landingpage1Fragment
import com.example.suitosomand12binar.fragment.Landingpage2Fragment

class ScreenSlidePagerActivity: AppCompatActivity() {

    private lateinit var viewPager : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_slide)

        setViewPager()
    }

    fun setViewPager(){
        //ngambil view pager di layout activitu_screen_slide
        viewPager = findViewById(R.id.pager)

//        val pageAdapter = ViewPagerAdapter(fragmentManager)
//        viewPager.adapter = pageAdapter

        val inputFrag = InputnameFragment()
        val lp1Frag = Landingpage1Fragment()
        val lp2Frag = Landingpage2Fragment()

        val fragmentList = listOf(
            inputFrag,lp1Frag,lp2Frag
        )
//        pageAdapter.addFragmentList(fragmentList)
//        viewPager.adapter = pageAdapter
    }
}