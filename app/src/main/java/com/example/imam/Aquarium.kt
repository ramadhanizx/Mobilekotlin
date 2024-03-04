package com.example.imam

import java.util.Random

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return isTooHot(temperature) || isDirty(dirty) || isSunday(day)
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    val changeWater = shouldChangeWater(day)

    println("Today is $day and the fish eat $food")
    println("Change water: $changeWater")
}

fun swim(speed: String = "fast") {
    println("Swimming $speed")
}

fun main(args: Array<String>) {
    feedTheFish()
    swim("turtle-like")
}
