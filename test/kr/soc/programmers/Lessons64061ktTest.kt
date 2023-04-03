package kr.soc.programmers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Lessons64061ktTest {
    @Test
    fun solution() {
        val board = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 3),
            intArrayOf(0, 2, 5, 0, 1),
            intArrayOf(4, 2, 4, 4, 2),
            intArrayOf(3, 5, 1, 3, 1)
        )
        val moves = intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
        assertEquals(4, Lessons64061kt().solution(board, moves))
    }
}