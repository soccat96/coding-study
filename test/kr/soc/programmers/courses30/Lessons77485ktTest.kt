package kr.soc.programmers.courses30

import kr.soc.programmers.courses30.Lessons77485kt
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Lessons77485ktTest {

    @Test
    fun solution() {
        val c = Lessons77485kt()
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