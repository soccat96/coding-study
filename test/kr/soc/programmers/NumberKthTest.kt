package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberKthTest {
    @Test
    fun test() {
//        [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
        val numberKth = NumberKth()
        assertThat(numberKth.solution(
            intArrayOf(1, 5, 2, 6, 3, 7, 4),
            arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))))
            .isEqualTo(intArrayOf(5, 6, 3)
        )
    }
}