package com.example.a4week

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.a4week.databinding.ActivityMainBinding
import com.example.a4week.databinding.ActivitySecondBinding
import com.example.a4week.model.Pizza
import com.example.a4week.R

class SecondActivity : AppCompatActivity() {

    companion object{
        const val KEY_RESULT = "KeyResult"
        var size = "25 cm. "
        var type = " traditional "
        var subdes = size + type
        var sCost = ""
        var lCost = ""
        var cost = ""
    }

    private lateinit var binding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val result: Pizza = intent.extras?.getSerializable(KEY_RESULT) as Pizza

        with(binding){
            binding.pizzaName.text = result.name

            binding.subDescription.text =  subdes
            binding.pizzaDescription.text= result.description
            binding.pizzaImage.setImageResource(result.image)
            binding.button.text = "Add to Cart for "+ result.price.toString()+"KZT"
            lCost = "Add to Cart for "+ result.priceLarge.toString()+"KZT"
            sCost = "Add to Cart for "+ result.priceSmall.toString()+"KZT"
            cost = "Add to Cart for "+ result.price.toString()+"KZT"

        }



    }

    fun choiceTrad(view: View){
        binding.trad.setBackgroundColor(getColor(R.color.white))
        binding.thin.setBackgroundColor(getColor(R.color.gray))
        type = "traditional"
        binding.subDescription.text = size + type

    }
    fun choiceThin(view: View){
        binding.thin.setBackgroundColor(getColor(R.color.white))
        binding.trad.setBackgroundColor(getColor(R.color.gray))
        type = " thin"

    }

    fun choiceSmall(view: View, ){
        binding.small.setBackgroundColor(getColor(R.color.white))
        binding.large.setBackgroundColor(getColor(R.color.gray))
        binding.medium.setBackgroundColor(getColor(R.color.gray))
        size = "25 cm. "
        binding.subDescription.text = size + type
        binding.button.text = sCost
    }
    fun choiceMedium(view: View){
        binding.small.setBackgroundColor(getColor(R.color.gray))
        binding.large.setBackgroundColor(getColor(R.color.gray))
        binding.medium.setBackgroundColor(getColor(R.color.white))
        size = "30 cm. "
        binding.subDescription.text =  size + type
        binding.button.text = cost
    }
    fun choiceLarge(view: View){
        binding.small.setBackgroundColor(getColor(R.color.gray))
        binding.large.setBackgroundColor(getColor(R.color.white))
        binding.medium.setBackgroundColor(getColor(R.color.gray))
        size = "35 cm. "
        binding.subDescription.text = size + type
        binding.button.text = lCost
    }

    fun goBack(view: View){
        finish()
    }


}