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


fun initShape(shape: RectangularShape?){
    shape?.apply{
        x = 10
        y = 20
        with = 100
        heigh = 200
        color = 0xFF0066
    } ?: throw IllegalArgumentException()
}

fun numarVocale(mesaj: String):Int{
    val vocale:String="aeiouAEIOU"
    var contor:Int=0;
    for(chr in mesaj){
        if (chr in "aeiouAEIOU")
            contor++;
    }
    return contor;
}

val data=listOf(4, 6, 34, 9, 2, 4, 7)
fun printData(){
    for(it in data)
        print("$it ")
}

fun printReverse() {
    for (i in data.size - 1 downTo 0)
        print(data[i])
}

val noDuplicate=data.distinct();
fun printNoDuplicate() {
    for (it in noDuplicate)
        print("$it ")
}

fun print3() {
    for (i in 0..2)
        print(data[i])
}

fun printPositive() {
    var ok = false;
    for (it in data)
        if (it < 0)
            ok = true;
    if (!ok)
        for (it in data)
            print("$it ")
}

fun printSqrt() {
    for (it in data) {
        val aux = Math.sqrt(it.toDouble())
        print("$aux ")
    }
}

fun Int.isEven(): Boolean = this % 2 == 0
fun printEven() {
    for (it in data)
        if (it.isEven())
            print("$it ")
}

fun printOddIndex() {
    for (i in 0..data.size - 1)
        if (!data[i].isEven())
            print("$i ")
}

fun Int.isPrime(): Boolean{
    return (2..this/2).none { this % it == 0 }
}

fun printPrime() {
    for (it in data)
        if (it.isPrime())
            print("$it ")
}

fun printLastPrime() {
    var prim = 0;
    for (it in data)
        if (it.isPrime())
            prim = it;
    if (prim == 0)
        print("nu exista numere prime")
    else
        print("ultimul numar prim din sir este $prim")
}

data class Student(val name: String, val address: String, val grade: Int)
val students = listOf(
    Student("John", "Boston", 6),
    Student("Jacob", "Baltimore", 2),
    Student("Edward", "New York", 7),
    Student("William", "Providence", 6),
    Student("Alice", "Philadelphia", 4),
    Student("Robert", "Boston", 7),
    Student("Richard", "Boston", 10),
    Student("Steven", "New York", 3) )


fun printStudents() {
    for (it in students)
        print(it)
}

fun printSortedStudents() {
    val sortedStudents = students.sortedBy { it.name }
    for (it in sortedStudents)
        print(it)
}

fun printName() {
    val sortedStudents = students.sortedBy { it.name }
    for (it in sortedStudents)
        print(it.name)
}

val comp = compareBy<Pair<Int, String>>({it.first}, {it.second})






