package com.example.menulistview

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FastFoodFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_top, container, false)

        val dishRecycler: RecyclerView = rootView.findViewById(R.id.dishRecycler)
        val layoutManager = GridLayoutManager(activity, 2)
        dishRecycler.layoutManager = layoutManager

        val dishes = Dishes(requireContext())
        val adapter = CaptionedImagesAdapter(dishes.getFastFoodList())
        dishRecycler.adapter = adapter

        adapter.setListener(object : CaptionedImagesAdapter.Listener {
            override fun onClick(position: Int) {
                val intent = Intent(activity, DishDetailActivity::class.java)
                intent.putExtra(DishDetailActivity.EXTRA_DISH_ID, position)
                intent.putExtra(DishDetailActivity.EXTRA_DISH, true)
                activity?.startActivity(intent)
            }
        })

        return rootView
    }
}

