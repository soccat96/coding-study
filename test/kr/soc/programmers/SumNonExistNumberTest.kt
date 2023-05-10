package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SumNonExistNumberTest {
    @Test
    fun test() {
//        [1,2,3,4,6,7,8,0]	14
//        [5,8,4,0,6,7,9]	6
        val sumNonExistNumber = SumNonExistNumber()
        assertThat(sumNonExistNumber.solution(intArrayOf(1,2,3,4,6,7,8,0))).isEqualTo(14)
        assertThat(sumNonExistNumber.solution(intArrayOf(5,8,4,0,6,7,9))).isEqualTo(6)
    }
}