package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LottoBestOrMinimumTest {
    @Test
    fun test() {
//        [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
//        [0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
//        [45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
        val lottoBestOrMinimum = LottoBestOrMinimum()
        assertThat(lottoBestOrMinimum.solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)))
            .isEqualTo(intArrayOf(3, 5))
        assertThat(lottoBestOrMinimum.solution(intArrayOf(0, 0, 0, 0, 0, 0), intArrayOf(38, 19, 20, 40, 15, 25)))
            .isEqualTo(intArrayOf(1, 6))
        assertThat(lottoBestOrMinimum.solution(intArrayOf(45, 4, 35, 20, 3, 9), intArrayOf(20, 9, 3, 45, 4, 35)))
            .isEqualTo(intArrayOf(1, 1))
    }
}