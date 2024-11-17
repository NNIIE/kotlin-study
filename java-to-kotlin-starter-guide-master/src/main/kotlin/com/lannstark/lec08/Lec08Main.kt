package com.lannstark.lec08

// 함수
fun main() {
    repeat("11")
    repeat("22", 10, true)
    repeat("33", useNewLine = false)

    println()

    printNameAndGender(name = "greg", gender = "man")

    println()

    val stringArray = arrayOf("A", "B", "C")
    printAll(*stringArray)
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}