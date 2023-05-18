package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MulSumTest {
    @Test
    fun test() {
//        [1,2,3,4]	[-3,-1,0,2]	3
//        [-1,0,1]	[1,0,-1]	-2
        val mulSum = MulSum()
        assertThat(mulSum.solution(intArrayOf(1, 2 , 3, 4), intArrayOf(-3, -1, 0, 2))).isEqualTo(3)
        assertThat(mulSum.solution(intArrayOf(-1, 0, 1), intArrayOf(1, 0, -1))).isEqualTo(-2)
    }
}