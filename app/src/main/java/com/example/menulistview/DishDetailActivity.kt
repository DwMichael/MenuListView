package com.example.menulistview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.menulistview.Model.Dish
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DishDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DISH = "dish"
        const val EXTRA_DISH_ID = "dishId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish_detail)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        val dishId = intent?.extras?.getInt(EXTRA_DISH_ID, -1)
        if (dishId != null && dishId != -1) {
            val dishes: List<Dish> = if (intent?.extras?.getBoolean(EXTRA_DISH, true) == true) {
                Dishes(this).getDishesList()
            } else {
                Dishes(this).getFastFoodList()
            }
            val dishName = dishes[dishId].getName()
            val cocktailRecipe = dishes[dishId].getRecipe()
            val textView: TextView = findViewById(R.id.dish_text)
            textView.text = cocktailRecipe

            title = dishName

            val dishImage = dishes[dishId].getImg()
            val imageView: ImageView = findViewById(R.id.cocktail_image)
            imageView.setImageDrawable(ContextCompat.getDrawable(this, dishImage))
            imageView.contentDescription = dishName
        }

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")

                if (dishId != null && dishId != -1) {
                    val dishes: List<Dish> =
                        if (intent?.extras?.getBoolean(EXTRA_DISH, true) == true) {
                            Dishes(this@DishDetailActivity).getDishesList()
                        } else {
                            Dishes(this@DishDetailActivity).getFastFoodList()
                        }
                    val dishName = dishes[dishId].getName()
                    val dishRecipe = dishes[dishId].getRecipe()

                    putExtra(Intent.EXTRA_SUBJECT, dishName)
                    putExtra(Intent.EXTRA_TEXT, dishRecipe)
                }
            }
            startActivity(Intent.createChooser(emailIntent, "Send email"))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

}