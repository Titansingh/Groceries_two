package com.example.groceries2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter



internal class PagerViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                BlankFragment1()
            }
            2 -> {
                BlankFragment2()
            }
            3 -> {
                BlankFragment3()
            }
            4 -> {
                BlankFragment4()
            }
            else -> HomeFragment()
        }
    }

    override fun getCount(): Int {

        return 5
    }

}