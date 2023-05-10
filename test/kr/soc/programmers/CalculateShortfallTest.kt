package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CalculateShortfallTest {
    @Test
    fun test() {
//        3	20	4	10
        val calculateShortfall = CalculateShortfall()
        assertThat(calculateShortfall.solution(3, 20, 4)).isEqualTo(10)
    }
}