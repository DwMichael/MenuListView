package com.example.menulistview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.TextView;
import com.example.menulistview.Model.Dish

class DishDetailFragment : Fragment(R.layout.fragment_recipe_detail) {
    private var dishId: Long = -1;



    override fun onStart() {
        super.onStart()
        if (view != null) {
            val title: TextView = requireView().findViewById(R.id.textTitle)
            val dishes = Dishes(requireContext())
            val dish: Dish = dishes.getDishesById(dishId.toInt())
            title.text = dish.getName()
            val desc: TextView = requireView().findViewById(R.id.textDescription)
            desc.text = dish.getRecipe()

        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putLong("dishId", dishId)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState != null) {
            dishId = savedInstanceState.getLong("dishId")
        }
    }




}
/*    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_recipe_detail, container, false)

    }
    fun setRecipe(id: Long) {
        this.recipeId = id
    }
    override fun onStart() {
        super.onStart()
        val view = view
        if (view != null) {
            val title = view.findViewById<TextView>(R.id.textTitle)
            val description = view.findViewById<TextView>(R.id.textDescription)
            val dish = Dish.generateData()
            dish?.let {
                title.text = it.name
                description.text = it.recipe
            }
        }
    }
    fun setDish(dish: Dish) {
        this.dish = dish
    }
}*/



    


