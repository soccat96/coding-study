package kr.soc.programmers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class Courses30Lessons68644KtKtTest {
    var courses30lessons68644: Courses30lessons68644? = null;

    @BeforeEach
    fun setUp() {
        courses30lessons68644 = Courses30lessons68644();
    }

    @Test
    fun solution() {
        assertArrayEquals(intArrayOf(2, 3, 4, 5, 6, 7), courses30lessons68644!!.solution(intArrayOf(2, 1, 3, 4, 1)))
        assertArrayEquals(intArrayOf(2, 5, 7, 9, 12), courses30lessons68644!!.solution(intArrayOf(5, 0, 2, 7)))
        assertArrayEquals(intArrayOf(10, 100, 110, 1000, 1010, 1100), courses30lessons68644!!.solution(intArrayOf(0, 100, 1000, 10)))
    }
}