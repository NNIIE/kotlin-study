package com.lannstark.lec14

// Data Class, Enum Class, Sealed Class, Sealed Interface
fun main() {

}


// Data Class (dto) getter/setter/equals,hashcode,toString
data class PersonDto(
    val name: String,
    val age: Int,
)

// enum
enum class Country(
    private val code: String
) {

    KOREA("KO"),
    AMERICA("US")

}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}