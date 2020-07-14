package com.example.myapplication


class MyMathClass {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun divide(a: Int, b: Int): Double {
        require(b != 0)
        return a / b.toDouble()
    }
}