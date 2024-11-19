package com.lannstark.lec11

// 접근제어자, 유틸클래스
class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {

    var price = _price
        private set

}

