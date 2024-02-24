package com.example.a4week.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import  androidx.recyclerview.widget.RecyclerView
import com.example.a4week.databinding.ItemNewpizzaBinding
import com.example.a4week.databinding.ItemPizzaBinding
import com.example.a4week.model.Pizza

class PizzaAdapter (
    private val onPizzaClick: (Pizza) -> Unit,
    private val onNewPizzaClick: (Pizza) -> Unit
): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    companion object{
        private const val PIZZA_ADAPTER_TAG = "PizzaAdapter"
        private const val VIEW_TYPE_PIZZA = 0
        private const val VIEW_TYPE_NEW_PIZZA = 1
    }

    private val pizzaList: ArrayList<Pizza> = ArrayList()
    private val newPizzaList: ArrayList<Pizza> = ArrayList()


    fun setData(pizzas: List<Pizza>){
        pizzaList.clear()
        pizzaList.addAll(pizzas)

        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_PIZZA) {
            PizzaViewHolder(
                ItemPizzaBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        } else {
            NewPizzaViewHolder(
                ItemNewpizzaBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }
    }

    override fun getItemCount()= pizzaList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d(PIZZA_ADAPTER_TAG,"onBindViewHolder: $position")
        val pizza = pizzaList[position]
        when (holder) {
            is PizzaViewHolder -> holder.bind(pizza)
            is NewPizzaViewHolder -> holder.bind(pizza)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (!pizzaList[position].new) {
            VIEW_TYPE_PIZZA
        } else {
            VIEW_TYPE_NEW_PIZZA
        }
    }
    inner class PizzaViewHolder(private val binding: ItemPizzaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(pizza: Pizza) {
            with(binding) {
                pizzaImage.setImageResource(pizza.image)
                pizzaName.text = pizza.name
                pizzaDescription.text = pizza.description
                pizzaPrice.text = "from " + pizza.priceSmall.toString() + " KZT"
                root.setOnClickListener { onPizzaClick(pizza) }
            }
         }
    }

    inner class NewPizzaViewHolder(private val binding: ItemNewpizzaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(pizza: Pizza) {
            with(binding) {
                npizza.setImageResource(pizza.image)
                nname.text = pizza.name
                nsmalldescription.text = pizza.description
                nprice.text = "from " + pizza.priceSmall.toString() + " KZT"
                root.setOnClickListener { onNewPizzaClick(pizza) }
            }
        }
    }

}