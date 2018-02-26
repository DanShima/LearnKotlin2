package com.ichimaya.learnkotlin

/**
 * Created by ichimaya on 2018-02-26.
 */
fun main(args: Array<String>){
    println("Hello, ${args[0]}!")
}

//omitting the return type is allowed only for functions with an expression body
fun max(a: Int, b: Int): Int = if (a > b) a else b

fun nameGreet (args: Array<String>){
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
}

