package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ClosestCharTest {
    @Test
    fun test() {
//        "banana"	[-1, -1, -1, 2, 2, 2]
//        "foobar"	[-1, -1, 1, -1, -1, -1]
        val closestChar = ClosestChar()
        assertThat(closestChar.solution("banana")).isEqualTo(intArrayOf(-1, -1, -1, 2, 2, 2))
        assertThat(closestChar.solution("foobar")).isEqualTo(intArrayOf(-1, -1, 1, -1, -1, -1))
    }
}