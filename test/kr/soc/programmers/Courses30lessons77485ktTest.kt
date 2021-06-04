package kr.soc.programmers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Courses30lessons77485ktTest {

    @Test
    fun solution() {
        val c = Courses30lessons77485kt()
        assertArrayEquals(intArrayOf(8, 10, 25),
                c.solution(6, 6,
                        arrayOf(
                                intArrayOf(2, 2, 5, 4),
                                intArrayOf(3, 3, 6, 6),
                                intArrayOf(5, 1, 6, 3)
                        )
                )
        )

        assertArrayEquals(intArrayOf(1, 1, 5, 3),
                c.solution(3, 3,
                        arrayOf(
                                intArrayOf(1, 1, 2, 2),
                                intArrayOf(1, 2, 2, 3),
                                intArrayOf(2, 1, 3, 2),
                                intArrayOf(2, 2, 3, 3),
                        )
                )
        )

        assertArrayEquals(intArrayOf(1),
                c.solution(100, 97,
                        arrayOf(
                                intArrayOf(1, 1, 100, 97)
                        )
                )
        )
    }
}