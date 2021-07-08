package kr.soc.programmers.courses30

import kr.soc.programmers.courses30.Lessons42587kt
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Lessons42587ktTest {

    @Test
    fun solution() {
        val courses30lessons42587Kt = Lessons42587kt()
        assertEquals(1, courses30lessons42587Kt.solution(intArrayOf(2, 1, 3, 2), 2));
        assertEquals(5, courses30lessons42587Kt.solution(intArrayOf(1, 1, 9, 1, 1, 1), 0));
    }
}