package com.example.myapplication

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MyMathClassTest {

    @Test
    fun isAdditionCorrect() {
        Assert.assertEquals(4, myMathClass?.sum(2, 2))
    }

    @Test(expected = IllegalArgumentException::class)
    fun isDivisionCorrect() {
        Assert.assertEquals(0.0, myMathClass?.divide(4, 0))
    }

    private var myMathClass: MyMathClass? = null

    @Before
    fun setUp() {
        myMathClass = MyMathClass()
    }

    @After
    fun tearDown() {
        myMathClass = null
    }

}
