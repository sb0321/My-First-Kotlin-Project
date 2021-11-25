package com.example

fun printMessage(message: String) {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("hello")
    printMessageWithPrefix("hello", "Log")
    printMessageWithPrefix("hello")
    printMessageWithPrefix(prefix = "Log", message = "hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}