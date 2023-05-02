package kr.soc.programmers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class ThreePersonTest {
    @Test
    fun test() {
//        [-2, 3, 0, 2, -5]	2
//        [-3, -2, -1, 0, 1, 2, 3]	5
//        [-1, 1, -1, 1]	0
        val threePerson = ThreePerson()
        assertThat(threePerson.solution(intArrayOf(-2, 3, 0, 2, -5))).isEqualTo(2)
        assertThat(threePerson.solution(intArrayOf(-3, -2, -1, 0, 1, 2, 3))).isEqualTo(5)
        assertThat(threePerson.solution(intArrayOf(-1, 1, -1, 1))).isEqualTo(0)
    }
}