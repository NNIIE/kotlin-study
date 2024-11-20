package com.lannstark.lec16

// 확장함수, infix 함수, inline 함수, 지역함수
fun main() {

}

// 확장함수
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 지역함수 - 잘 사용하지 않음
fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다. 현재 값: ${name}")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}