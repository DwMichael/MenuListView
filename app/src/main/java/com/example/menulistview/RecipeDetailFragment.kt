package com.example.menulistview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RecipeDetailFragment : Fragment() {

    private var recipeId: Long = 0
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_recipe_detail, container, false)

    }
    fun setRecipe(id: Long) {
        this.recipeId = id
    }


}