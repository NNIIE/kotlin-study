package com.lannstark.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L

    val person = Person("greg", 30)
    println("내 이름은 ${person.name}이고, 나이는 ${person.age} 입니다.")

    val name = "greg"
    println("이름: $name")

    println()

    println("""
        이름: ${person.name}
        나이: ${person.age}
    """.trimIndent())

    println()

    val abc = "ABC"
    println(abc[0])
    println(abc[1])
    println(abc[2])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.age)    // 스마트 캐스트
    }

    if (obj !is Person) {
        println("obj는 Person 타입이 아니다." )
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person     // obj가 null이 아니라면 Person 타입으로 만들고 null이라면 obj as? Person 전체가 null
    println(person?.age)
}