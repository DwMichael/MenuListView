package com.example.menulistview.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menulistview.RecipeDetailFragment


class DetailItemActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.menulistview.R.layout.activity_detail_item)
        (supportFragmentManager.findFragmentById(com.example.menulistview.R.id.detail_frag) as RecipeDetailFragment?)?.setRecipe(
            1
        )

    }

}