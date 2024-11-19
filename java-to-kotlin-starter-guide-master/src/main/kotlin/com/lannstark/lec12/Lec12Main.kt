package com.lannstark.lec12

// object, static 함수와 변수, 싱글톤, 익명클래스, 정적 팩토리 메서드
fun main() {
    Person.newBaby("greg")

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int
) {

    companion object {
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }

}

object Singleton {
    var a: Int = 0
}

fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
