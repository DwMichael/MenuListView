package com.example.menulistview

import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.menulistview.Model.Dish
import android.widget.ImageView
import android.widget.TextView
import android.view.LayoutInflater

class CaptionedImagesAdapter(private val dishes: List<Dish>) :
    RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>(){
    private var listener: Listener? = null
    interface Listener {
        fun onClick(position: Int)
    }
    fun setListener(listener: Listener) {
        this.listener = listener
    }

    inner class ViewHolder(val cardView: CardView) : RecyclerView.ViewHolder(cardView)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_captioned_image, parent, false) as CardView
        return ViewHolder(cardView)
    }
    override fun getItemCount(): Int {
        return dishes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cardView = holder.cardView
        val imageView = cardView.findViewById<ImageView>(R.id.info_image)
        val drawable = ContextCompat.getDrawable(cardView.context, dishes[position].getImg())
        imageView.setImageDrawable(drawable)
        imageView.contentDescription = dishes[position].getName()
        val textView = cardView.findViewById<TextView>(R.id.info_text)
        textView.text = dishes[position].getName()
        cardView.setOnClickListener {
            listener?.onClick(position)
        }
    }


}