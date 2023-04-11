package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChooseNumberTest {
    @Test
    fun test() {
//        3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
//        5	[1, 9, 3, 10, 13, 5]	[10, 5]
//        12	[2, 100, 120, 600, 12, 12]	[120, 600, 12, 12]
        val chooseNumber = ChooseNumber()
        assertThat(chooseNumber.solution(3, intArrayOf(4, 5, 6, 7, 8, 9, 10, 11, 12))).isEqualTo(intArrayOf(6, 9, 12))
        assertThat(chooseNumber.solution(5, intArrayOf(1, 9, 3, 10, 13, 5))).isEqualTo(intArrayOf(10, 5))
        assertThat(chooseNumber.solution(12, intArrayOf(2, 100, 120, 600, 12, 12))).isEqualTo(intArrayOf(120, 600, 12, 12))
    }
}