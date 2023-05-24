package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FailPercentageTest {
    @Test
    fun test() {
//        5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//        4	[4,4,4,4,4]	[4,1,2,3]

        val failPercentage = FailPercentage()
        assertThat(failPercentage.solution(5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3))).isEqualTo(intArrayOf(3,4,2,1,5))
        assertThat(failPercentage.solution(4, intArrayOf(4,4,4,4,4))).isEqualTo(intArrayOf(4,1,2,3))
    }
}