package kr.soc.programmers.courses30

import kr.soc.programmers.courses30.Lessons42842kt
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Lessons42842ktTest {

    @Test
    fun solution() {
        val c = Lessons42842kt()
        assertArrayEquals(intArrayOf(4, 3), c.solution(10, 2))
        assertArrayEquals(intArrayOf(3, 3), c.solution(8, 1))
        assertArrayEquals(intArrayOf(8, 6), c.solution(24, 24))
    }
}