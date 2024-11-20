package com.lannstark.lec15

fun main() {

    // 배열
    val array = arrayOf(100, 200)

}

// 배열
fun array() {
    val array = arrayOf(100, 200)
    array.plus(300)
}

// collection
fun collection() {
    val numbers = listOf(100, 200)
    val mutableNumbers = mutableListOf(100, 200)
    val setNumbers = setOf(100, 200)

    val emptyList = emptyList<Int>()

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }

    /**
     * List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 null이 아님
     * List<Int>? : 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
     * List<Int?>? : 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음
     */
}

// map
fun map() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "Monday"
    oldMap[2] = "Tuesday"

    mapOf(
        1 to "Monday",
        2 to "Tuesday"
    )

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}
