package com.example.menulistview.Activity

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menulistview.RecipeDetailFragment


class DetailItemActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.menulistview.R.layout.activity_detail_item)
        val frag: RecipeDetailFragment? =
            supportFragmentManager.findFragmentById(com.example.menulistview.R.id.detail_frag) as RecipeDetailFragment?
        frag.setCocktail(1)
    }
}