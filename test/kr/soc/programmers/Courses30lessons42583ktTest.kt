package kr.soc.programmers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Courses30lessons42583ktTest {

    @Test
    fun solution() {
        val x = Courses30lessons42583kt()
        assertEquals(8, x.solution(2, 10, intArrayOf(7, 4, 5, 6)))
        assertEquals(101, x.solution(100, 100, intArrayOf(10)))
        assertEquals(110, x.solution(100, 100, intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10)))
    }
}