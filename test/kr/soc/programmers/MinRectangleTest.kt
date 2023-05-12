package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinRectangleTest {
    @Test
    fun test() {
//        [[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//        [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
//        [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133
        val minRectangle = MinRectangle()
        assertThat(minRectangle.solution(arrayOf(
            intArrayOf(60, 50),
            intArrayOf(30, 70),
            intArrayOf(60, 30),
            intArrayOf(80, 40)
        ))).isEqualTo(4000)
        assertThat(minRectangle.solution(arrayOf(
            intArrayOf(10, 7),
            intArrayOf(12, 3),
            intArrayOf(8, 15),
            intArrayOf(14, 7),
            intArrayOf(5, 15)
        ))).isEqualTo(120)
        assertThat(minRectangle.solution(arrayOf(
            intArrayOf(14, 4),
            intArrayOf(19, 6),
            intArrayOf(6, 16),
            intArrayOf(18, 7),
            intArrayOf(7, 11)
        ))).isEqualTo(133)
    }
}