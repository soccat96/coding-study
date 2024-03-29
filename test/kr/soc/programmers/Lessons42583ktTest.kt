package kr.soc.programmers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Lessons42583ktTest {

    @Test
    fun solution() {
        val x = Lessons42583kt()
        assertEquals(8, x.solution(2, 10, intArrayOf(7, 4, 5, 6)))
        assertEquals(101, x.solution(100, 100, intArrayOf(10)))
        assertEquals(110, x.solution(100, 100, intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10)))
    }
}