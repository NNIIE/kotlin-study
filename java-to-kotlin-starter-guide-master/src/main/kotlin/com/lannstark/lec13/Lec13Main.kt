package com.lannstark.lec13

import com.lannstark.lec13.JavaHouse.LivingRoom

// 중첩클래스
fun main() {

}

// static 내부 클래스
class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    class LivingRoom(
        private val area: Double
    )

}

// 권장되지 않은 내부 클래스
class House2(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House2.address
    }
}