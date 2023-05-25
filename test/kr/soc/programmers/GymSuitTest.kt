package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GymSuitTest {
    @Test
    fun test() {
//        5	[2, 4]	[1, 3, 5]	5
//        5	[2, 4]	[3]	4
//        3	[3]	[1]	2
        val gymSuit = GymSuit()
        assertThat(gymSuit.solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5))).isEqualTo(5)
        assertThat(gymSuit.solution(5, intArrayOf(2, 4), intArrayOf(3))).isEqualTo(4)
        assertThat(gymSuit.solution(3, intArrayOf(3), intArrayOf(1))).isEqualTo(2)
    }
}