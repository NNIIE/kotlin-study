package com.lannstark.lec02

// null
fun main() {
    // Safe Call: null이 아니면 실행하고, null이면 실행하지 않는다. (그대로 null)
    val str1: String? = null
    println(str1?.length)

    // Elvis 연산자: 앞의 연산 결과가 null이면 뒤의 값을 사용 (Safe Call과 함께 사용)
    val str2: String? = null
    println(str2?.length ?: "null")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
            ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun earlyReturn(number: Long?): Long {
    number ?: return 0
    return number + 1
}

fun startsWith4(str: String?): Boolean {
    // nullable type 이지만, 절대 null이 아니라고 판단하는 경우 (만약 런타임에 null이면 NPE 발생)
    return str!!.startsWith("A")
}