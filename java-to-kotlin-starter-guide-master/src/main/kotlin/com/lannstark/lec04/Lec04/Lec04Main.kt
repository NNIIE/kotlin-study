package com.lannstark.lec04.Lec04

import com.lannstark.lec04.JavaMoney

// 연산자
fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)
    val money3 = money2

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    println(money1 == money2)   // 동등성 (간접적으로 equals 호출)
    println(money2 === money3)  // 동일성

}