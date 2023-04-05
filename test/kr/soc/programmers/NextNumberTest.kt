package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NextNumberTest {
    @Test
    fun test() {
//        [1, 2, 3, 4]	5
//        [2, 4, 8]	16
        val nextNumber = NextNumber()
        assertThat(nextNumber.solution(intArrayOf(1, 2, 3, 4))).isEqualTo(5)
        assertThat(nextNumber.solution(intArrayOf(2, 4, 8))).isEqualTo(16)
    }
}