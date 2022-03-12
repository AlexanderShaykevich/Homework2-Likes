package ru.netology

fun main() {
    val likes = 61
    val display = if(likes%10==1) "человеку" else "людям"
    println("Понравилось: $likes $display")
}
