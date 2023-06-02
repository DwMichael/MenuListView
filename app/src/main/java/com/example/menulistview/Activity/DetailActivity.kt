package com.example.menulistview.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menulistview.JoggingDetailFragment
import com.example.menulistview.R


class DetailActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val frag: JoggingDetailFragment =
            supportFragmentManager.findFragmentById(R.id.detail_frag) as JoggingDetailFragment
        /*(supportFragmentManager.findFragmentById(com.example.menulistview.R.id.detail_frag) as DishDetailFragment?)?.setRecipe(1)*/
        val dishId = intent.getLongExtra(EXTRA_DISH_ID,-1)
        frag.setDish(dishId.toInt())
    }
    companion object {
        const val EXTRA_DISH_ID: String = "id"
    }

}