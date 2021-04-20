package kr.soc.programmers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Courses30Lessons42587KtKtTest {

    @Test
    fun solution() {
        val courses30lessons42587Kt = Courses30lessons42587Kt()
        assertEquals(1, courses30lessons42587Kt.solution(intArrayOf(2, 1, 3, 2), 2));
        assertEquals(5, courses30lessons42587Kt.solution(intArrayOf(1, 1, 9, 1, 1, 1), 0));
    }
}