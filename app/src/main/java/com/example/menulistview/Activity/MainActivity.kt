package com.example.menulistview.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.menulistview.R
import com.example.senthil.kotlin_listview.Adapter.SimpleAdapter

class MainActivity : AppCompatActivity() {

    var listView: ListView? = null
    var adapter: SimpleAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById<ListView>(R.id.listView)
        adapter = SimpleAdapter(this, generateData())

        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()

    }

    val buttonClick = findViewById<>(R.id.button_click)


























    buttonClick.setOnClickListener {
        val intent = Intent(this, NewActivity::class.java)
        startActivity(intent)
    }
    fun generateData(): ArrayList<UserDto> {
        var result = ArrayList<UserDto>()

        for (i in 0..9) {
            var user: UserDto = UserDto("Bett", "Awesome work ;)")
            result.add(user)
        }

        return result
    }

    class UserDto {
        var name: String = ""
        var comment: String = ""

        constructor() {}

        constructor(name: String, comment: String) {
            this.name = name
            this.comment = comment
        }
    }
}
