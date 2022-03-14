package ru.netology

fun main() {
    val likes = 1011
    val display = if(likes%10!=1 || likes%100==11) "людям" else "человеку"
    println("Понравилось: $likes $display")
}




