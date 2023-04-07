package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CountSevenTest {
    @Test
    fun test() {
//        [7, 77, 17]	4
//        [10, 29]	0
        val countSeven = CountSeven()
        assertThat(countSeven.solution(intArrayOf(7, 77, 17))).isEqualTo(4)
        assertThat(countSeven.solution(intArrayOf(10, 29))).isEqualTo(0)
    }
}