package com.example.menulistview.Activity

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menulistview.R
import com.example.menulistview.RecipeDetailFragment

class DetailItemActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_item)
        (supportFragmentManager.findFragmentById(R.id.detail_frag) as RecipeDetailFragment?)?.setRecipe(
            1
        )

    }
}