package com.example.tema1

open class Account(var sold:Double){
    open fun withdrawMoney(suma:Double){
        sold-=suma
    }

    fun depositMoney(suma:Double){
        sold+=suma;
    }
}

class SavingAccount(sold:Double):Account(sold){
    override fun withdrawMoney(suma: Double) {
        if (sold-suma>=0)
            super.withdrawMoney(suma)
        else
            println("nu se poate efectua aceeasta operatie")
    }
}

fun cardinal(unghi:Int):String{
    return when (unghi) {
        90 ->  "est"
        180 ->  "sud"
        270 ->  "vest"
        360 ->  "nord"
        else -> "date incorecte"
    }
}

fun numarVocale(mesaj: String):Int{
    val vocale:String="aeiouAEIOU"
    var contor:Int=0;
    for(i in 0..mesaj.length-1){
        if (vocale.indexOf(mesaj[i],0)!=-1)
            contor++;
    }
    return contor;
}

class RectangularShape(var x: Int, var y: Int, var with: Int, var heigh: Int, var color: Int) {
    fun measure(){}
    fun render(){}
}

fun validateShape(shape: RectangularShape): Boolean {
    when{
        shape.x < 0 || shape.y < 0 -> { print("invalid position")
            return false }
        shape.with > 1024 || shape.heigh > 1024 -> { print("shape too big")
            return false }
        shape.color < 0 || shape.color > 0xFFFFFF -> { print("invalid color")
            return false }
        else -> return true
    }
}


