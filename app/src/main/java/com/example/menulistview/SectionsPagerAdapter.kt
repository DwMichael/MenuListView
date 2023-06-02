package com.example.menulistview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cocktails.HomeFragment

class SectionsPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> FastFoodFragment()
            2 -> FastFoodFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}