package com.lannstark.lec09

// 클래스
fun main() {
    val person = Person("greg", 100)
    println(person.name)
    person.age = 10
    println(person.age)

}

class Person (
    val name: String = "greg",
    var age: Int = 1
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    fun getUppercaseName(): String = this.name.uppercase()

    val isAdult: Boolean 
        get() = this.age >= 20

}