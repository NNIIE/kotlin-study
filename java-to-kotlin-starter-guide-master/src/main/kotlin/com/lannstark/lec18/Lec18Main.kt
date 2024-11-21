package com.lannstark.lec18

import com.lannstark.lec17.Fruit

// 스트림
fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1000, 1000),
        Fruit(2, "사과", 1200, 1200),
        Fruit(3, "사과", 1200, 1200),
        Fruit(4, "사과", 1500, 1500),
        Fruit(5, "바나나", 3000, 3000),
        Fruit(6, "바나나", 3200, 3200),
        Fruit(7, "바나나", 2500, 2500),
        Fruit(8, "수박", 10000, 10000)
    )

    println(fruits.filter { fruit -> fruit.name == "사과" })
    println(fruits.filterIndexed { index, fruit -> fruit.name == "사과" })

    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }

    val appleNotNull = fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.nullOrValue() }

    val isAllApple = fruits.all { fruit -> fruit.name = "사과" }
    val isNoApple = fruits.none() { fruit -> fruit.name = "사과" }
    val fruitCount = fruits.count()
    val fruitSort = fruits.sortedBy { fruit -> fruit.currentPrice }

}