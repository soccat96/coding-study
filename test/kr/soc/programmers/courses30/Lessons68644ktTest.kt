package kr.soc.programmers.courses30

import kr.soc.programmers.courses30.Lessons68644
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class Lessons68644ktTest {
    var lessons68644: Lessons68644? = null;

    @BeforeEach
    fun setUp() {
        lessons68644 = Lessons68644();
    }

    @Test
    fun solution() {
        assertArrayEquals(intArrayOf(2, 3, 4, 5, 6, 7), lessons68644!!.solution(intArrayOf(2, 1, 3, 4, 1)))
        assertArrayEquals(intArrayOf(2, 5, 7, 9, 12), lessons68644!!.solution(intArrayOf(5, 0, 2, 7)))
        assertArrayEquals(intArrayOf(10, 100, 110, 1000, 1010, 1100), lessons68644!!.solution(intArrayOf(0, 100, 1000, 10)))
    }
}