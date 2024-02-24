package com.example.a4week.model
import com.example.a4week.R
object PizzaDataSource {
    val pizzaList: ArrayList<Pizza> = arrayListOf(
        Pizza(
            name = "Julien",
            size = 30,
            description = "Chicken, mushrooms, rich mushroom sauce, red onion, garlic, mushrooms, cheddar and parmesan cheeses, alfredo sauce",
            image = R.drawable.julienne,
            price = 3500,
            priceLarge = 4900,
            priceSmall = 2700,
            new = true
        ),
        Pizza(
            name = "Pepperoni",
            size = 30,
            description = "Chicken pepperoni, extra mozzarella cheese, tomatoes, marinara sauce",
            image = R.drawable.pepperoni,
            price = 3500,
            priceLarge = 4700,
            priceSmall = 2400,
            new = false
        ),
        Pizza(
            name = "Diablo",
            size = 30,
            description = "Beef meatballs, spicy chorizo, jalapenos, tomatoes, sweet pepper, red onion, mozzarella cheese, barbecue sauce, marinara sauce",
            image = R.drawable.diablo,
            price = 3500,
            priceLarge = 4900,
            priceSmall = 2700,
            new = true
        ),
        Pizza(
            name = "BBQ Sausage",
            size = 30,
            description = "Spicy chorizo, barbecue sauce, tomatoes, red onion, mozzarella cheese, marinara sauce",
            image = R.drawable.bbq,
            price = 3500,
            priceLarge = 4900,
            priceSmall = 2700,
            new = false
        ),
        Pizza(
            name = "Vegetarian",
            size = 30,
            description = "Mushrooms, bryndza cheese, tomatoes, sweet pepper, red onion, mozzarella cheese, marinara sauce, Italian seasoning",
            image = R.drawable.vegan,
            price = 3500,
            priceLarge = 4900,
            priceSmall = 2700,
            new = false
        ),
        Pizza(
            name = "Burger Pizza",
            size = 30,
            description = "Chicken ham, pickles, tomatoes, red onion, garlic, burger sauce, mozzarella cheese, marinara sauce",
            image = R.drawable.burger,
            price = 3500,
            priceLarge = 5200,
            priceSmall = 2900,
            new = false
        ),
        Pizza(
            name = "Hawaiian",
            size = 30,
            description = "Double chicken, pineapple, mozzarella cheese, Alfredo sauce",
            image = R.drawable.hawaiian,
            price = 3500,
            priceLarge = 4900,
            priceSmall = 2700,
            new = false
        ),
        Pizza(
            name = "Dodo",
            size = 30,
            description = "Chicken ham, beef meatballs, chicken pepperoni, tomatoes, mushrooms, sweet pepper, red onion, mozzarella cheese, marinara sauce, garlic",
            image = R.drawable.dodo,
            price = 3500,
            priceLarge = 4900,
            priceSmall = 2900,
            new= true
        )



    )

}