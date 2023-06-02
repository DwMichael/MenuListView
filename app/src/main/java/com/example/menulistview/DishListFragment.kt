package com.example.menulistview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment
import com.example.menulistview.Model.Dish
import android.R
import android.content.Context
import android.location.GnssAntennaInfo
import android.widget.ListView


class DishListFragment : ListFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val list: ArrayList<Dish> = arrayListOf()
        val dishes = Dishes(requireContext())
        dishes.getDishesList().forEach{
            list.add(it)
        }
        val adapter = ArrayAdapter(inflater.context, R.layout.simple_list_item_1, list)
        listAdapter = adapter
        return super.onCreateView(inflater, container, savedInstanceState)
    }
    private lateinit var listener: Listener
    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as Listener
    }
    override fun onListItemClick(listView: ListView, itemView: View, position: Int, id: Long) {
        listener.itemClicked(id.toInt())
    }
    interface Listener {
        fun itemClicked(id: Int)
    }
}