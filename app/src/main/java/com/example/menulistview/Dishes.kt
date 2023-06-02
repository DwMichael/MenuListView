package com.example.menulistview

import android.content.Context
import com.example.menulistview.Model.Dish

class Dishes(context: Context) {
    private val dishesList = arrayListOf<Dish>()
    private val fastFoodList = arrayListOf<Dish>()

    init {
        val resources = context.resources
        dishesList.add(
            Dish(
                resources.getString(R.string.hamburger_title),
                resources.getString(R.string.hamburger_recipe),
                R.drawable.burger
            )
        )
        dishesList.add(
            Dish(
                resources.getString(R.string.spaghetti_title),
                resources.getString(R.string.spaghetti_recipe),
                R.drawable.spagethi
            )
        )
        fastFoodList.add(
            Dish(
                resources.getString(R.string.hamburger_title),
                resources.getString(R.string.hamburger_recipe),
                R.drawable.burger
            )
        )
        fastFoodList.add(
            Dish(
                resources.getString(R.string.hamburger_title),
                resources.getString(R.string.hamburger_recipe),
                R.drawable.burger
            )
        )

    }
    fun getDishesById(id: Int): Dish {
        return dishesList[id]
    }

    fun getDishesList(): List<Dish> {
        return dishesList
    }
    fun getFastFoodList(): List<Dish> {
        return fastFoodList
    }


}