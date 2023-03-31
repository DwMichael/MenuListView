package com.example.menulistview.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.menulistview.R
import com.example.senthil.kotlin_listview.Adapter.ListViewModelAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.listView)
        val productsList = arrayOf("Hamburger","Jabułko","Chleb")
        var listViewAdapter = ListViewModelAdapter(this, android.R.layout.simple_list_item_1,productsList)
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,productsList)
        listView.adapter = arrayAdapter
        listView.setOnItemClickListener{adapterView,view,i,l -> Toast.makeText(this,"Item Selected is "+productsList[i],Toast.LENGTH_LONG).show()}
    }
}
