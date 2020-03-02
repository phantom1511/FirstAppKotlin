package com.dastan.firstappkotlin.ui

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dastan.firstappkotlin.R
import com.dastan.firstappkotlin.model.MockModel
import com.dastan.firstappkotlin.model.Purchases
import kotlinx.android.synthetic.main.data_list.view.*

class Adapter(var list: List<Purchases>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.data_list, parent, false)
        )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val  lists = mutableListOf<TextView>().apply {
            this.add(holder.itemView.tvNumber)
            this.add(holder.itemView.tvProductName)
            this.add(holder.itemView.tvAmountRv)
            this.add(holder.itemView.tvDiscountRv)
            this.add(holder.itemView.tvSumRv)
        }

        holder.bind(list[position])
        for (i in 0 until itemCount step 2){
            if (holder.adapterPosition == i){
                holder.itemView.setBackgroundColor(Color.GRAY)
            }
        }
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(purchases: Purchases) {
            itemView.tvNumber.text = purchases.number.toString()
            itemView.tvProductName.text = purchases.purchasesName
            itemView.tvAmountRv.text = purchases.price.toString()
            itemView.tvDiscountRv.text = purchases.discount.toString()
            itemView.tvAmountRv.text = purchases.result.toString()
        }
    }

}