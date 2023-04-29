package kr.soc.programmers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class MakeHamburgerTest {
    @Test
    fun test() {
//        [2, 1, 1, 2, 3, 1, 2, 3, 1]	2
//        [1, 3, 2, 1, 2, 1, 3, 1, 2]	0
        val makeHamburger = MakeHamburger()
        assertThat(makeHamburger.solution(intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1))).isEqualTo(2)
        assertThat(makeHamburger.solution(intArrayOf(1, 3, 2, 1, 2, 1, 3, 1, 2))).isEqualTo(0)
    }
}