package kr.soc.programmers.courses30

import kr.soc.programmers.courses30.Lessons64061kt
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Lessons64061ktTest {
    @Test
    fun solution() {
        var board = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 3),
            intArrayOf(0, 2, 5, 0, 1),
            intArrayOf(4, 2, 4, 4, 2),
            intArrayOf(3, 5, 1, 3, 1)
        )
        var moves = intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
        assertEquals(4, Lessons64061kt().solution(board, moves))
    }
}