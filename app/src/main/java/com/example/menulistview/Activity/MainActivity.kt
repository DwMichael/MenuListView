package com.example.menulistview.Activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager2.widget.ViewPager2
import com.example.menulistview.*
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

/*import com.example.senthil.kotlin_listview.Adapter.SimpleAdapter*/

class MainActivity : AppCompatActivity(), DishListFragment.Listener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewPager: ViewPager2 = findViewById(R.id.pager)
        viewPager.adapter = SectionsPagerAdapter(this)
        val tabLayout: TabLayout = findViewById(R.id.tabs)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = resources.getText(R.string.home_tab)
                1 -> tab.text = resources.getText(R.string.kat1_tab)
                2 -> tab.text = resources.getText(R.string.kat2_tab)
            }
        }.attach()
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_create_order -> {
                val intent = Intent(this, ActionActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
        override fun itemClicked(id: Int) {
            val fragmentContainer = findViewById<View>(R.id.fragment_container)
            if (fragmentContainer != null) {
                val details = JoggingDetailFragment()
                val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
                details.setDish(id)
                ft.replace(R.id.fragment_container, details)
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                ft.addToBackStack(null)
                ft.commit()
            } else {
                val intent = Intent(this, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_DISH_ID, id)
                startActivity(intent)
            }
        }

    }
