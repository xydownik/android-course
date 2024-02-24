package com.example.a4week.model
import java.io.Serializable
import java.util.UUID
data class Pizza (
    val id : String = UUID.randomUUID().toString(),
    val name : String,
    val size : Int,
    val description : String,
    val image : Int,
    val price : Int,
    val priceSmall:Int,
    val priceLarge: Int,
    val new:Boolean
):Serializable{

}

