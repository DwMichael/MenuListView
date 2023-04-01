package com.example.senthil.kotlin_listview.Adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.menulistview.Model.Dish
import com.example.menulistview.R

class SimpleAdapter(private var activity: Activity, private var items: ArrayList<Dish>) : BaseAdapter() {

    private class ViewHolder(row: View?) {
        var txtName: TextView? = null

//        var txtRecipe: TextView? = null

        init {
            this.txtName = row?.findViewById<TextView>(R.id.tvTitle)
//            this.txtRecipe = row?.findViewById<TextView>(R.id.tvContent)
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View?
        val viewHolder: ViewHolder
        if (convertView == null) {
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.list_item, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var dishish = items[position]
        viewHolder.txtName?.text = dishish.name
//        viewHolder.txtRecipe?.text = dishish.recipe

        return view as View
    }

    override fun getItem(i: Int): Dish {
        return items[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }
}