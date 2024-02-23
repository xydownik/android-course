package com.example.a4week

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4week.databinding.ActivityMainBinding
import com.example.a4week.databinding.ActivitySecondBinding
import com.example.a4week.model.Pizza

class SecondActivity : AppCompatActivity() {

    companion object{
        const val KEY_RESULT = "KeyResult"
    }

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result: Pizza = intent.extras?.getSerializable(KEY_RESULT)as Pizza
        with(binding){
            binding.pizzaName.text = result.name
            binding.pizzaDescription.text=result.description
            binding.pizzaImage.setImageResource(result.image)
        }

    }

}