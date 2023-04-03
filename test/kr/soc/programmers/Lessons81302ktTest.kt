package kr.soc.programmers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class Lessons81302ktTest {

    @Test
    fun testCode() {
        val l = Lessons81302kt()
        l.solution(arrayOf(arrayOf("OOPOO", "OPOOO", "OOOOO", "OOOOO", "OOOOO")))
    }

    @Test
    fun solution() {
        val l = Lessons81302kt()
        assertArrayEquals(
                intArrayOf(0),
                l.solution(arrayOf(arrayOf("OOPOO", "OPOOO", "OOOOO", "OOOOO", "OOOOO")))
        )
        assertArrayEquals(
                intArrayOf(1, 0, 1, 1, 1),
                l.solution(
                        arrayOf(
                                arrayOf("POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"),
                                arrayOf("POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"),
                                arrayOf("PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"),
                                arrayOf("OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"),
                                arrayOf("PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP")
                        )
                )
        )
    }
}