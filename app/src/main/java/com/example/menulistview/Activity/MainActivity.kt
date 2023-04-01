package com.example.menulistview.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.menulistview.Model.Dish
import com.example.menulistview.R
import com.example.senthil.kotlin_listview.Adapter.SimpleAdapter

class MainActivity : AppCompatActivity() {

    var listView: ListView? = null
    var adapter: SimpleAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById<ListView>(R.id.listView)
        adapter = SimpleAdapter(this, Dish.generateData())

        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()

    }

    //val buttonClick = findViewById<>(R.id.button_click)
    fun onShowDetail(view: View) {
        val intent = Intent(this, DetailItemActivity::class.java)
        startActivity(intent)
    }

}
