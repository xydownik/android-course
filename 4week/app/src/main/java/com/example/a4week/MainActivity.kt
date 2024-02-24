package com.example.a4week

import android.os.Bundle
import android.content.Intent;
import android.provider.DocumentsContract.Root
import androidx.appcompat.app.AppCompatActivity
import android.widget.SearchView
import android.widget.Toast
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.a4week.databinding.ActivityMainBinding
import com.example.a4week.model.Pizza;
import com.example.a4week.model.PizzaDataSource;
import com.example.a4week.adapter.PizzaAdapter;
import java.util.Locale


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var adapter : PizzaAdapter? = null
    private lateinit var searchView : SearchView
    private var pizzaList: ArrayList<Pizza> = PizzaDataSource.pizzaList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        searchView = binding.searchBar
        adapter = PizzaAdapter(
            onPizzaClick = { handlePizzaClick(it) },
            onNewPizzaClick = { handleNewPizzaClick(it) }
        )
        adapter?.setData(pizzaList)
        binding.recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }
        })



    }

    private fun filterList(newText: String?) {
        if(newText!=null){
            val filtered = pizzaList.filter { it.name.lowercase(Locale.ROOT).contains(newText.lowercase(Locale.ROOT)) }
            if(filtered.isEmpty()){
                Toast.makeText(this,"No such Pizza", Toast.LENGTH_SHORT).show()
            }else{
                adapter?.setData(filtered)
            }
        }
        else{
            adapter?.setData(pizzaList)
        }

    }

    private fun handlePizzaClick(pizza: Pizza) {
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra(SecondActivity.KEY_RESULT,pizza)
        startActivity(intent)
    }

    private fun handleNewPizzaClick(pizza: Pizza) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(SecondActivity.KEY_RESULT, pizza)
        startActivity(intent)
    }


}