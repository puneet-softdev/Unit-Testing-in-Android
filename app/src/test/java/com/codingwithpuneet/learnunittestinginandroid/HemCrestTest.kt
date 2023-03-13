package com.codingwithpuneet.learnunittestinginandroid

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.hamcrest.Matchers.not
import org.hamcrest.Matchers.containsString
import org.junit.After
import org.junit.Before

import org.junit.Test

class HemCrestTest {

    @Before
    fun setUp() {
        // set up any data or objects needed for the test case
    }

    @After
    fun tearDown() {
        // clean up any data or objects created during the test case
    }

    @Test
    fun useEqualTo() {
        val expected = "CodingWithPuneet"
        val actual = "CodingWithPuneet"
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun useInstanceOf() {
        val obj: Any = "Hello"
        assertThat(obj, instanceOf(String::class.java))
    }

    @Test
    fun testNot() {
        val actualString = "Hello, world!"
        val expectedString = "Goodbye, world!"
        assertThat(actualString, not(equalTo(expectedString)))
    }

    @Test
    fun testAnyOf() {
        val actualString = "Hello, world!"
        assertThat(actualString, anyOf(
            equalTo("Goodbye, world!"),
            containsString("world")
        ))
    }

    @Test
    fun testAllOf() {
        val actualString = "Hello, world!"
        assertThat(actualString, allOf(
            equalTo("Hello, world!"),
            containsString("world")
        ))
    }
}