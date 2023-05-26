package kr.soc.baekjoon

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Problem11720KtTest {
    @Test
    fun test() {
        // 1 1  1
        // 5 54321  15
        // 25 7000000000000000000000000  7
        // 11 10987654321  46
        assertThat(Problem11720.solution(arrayOf("1", "1"))).isEqualTo(1)
        assertThat(Problem11720.solution(arrayOf("5", "54321"))).isEqualTo(15)
        assertThat(Problem11720.solution(arrayOf("25", "7000000000000000000000000"))).isEqualTo(7)
        assertThat(Problem11720.solution(arrayOf("11", "10987654321"))).isEqualTo(46)
    }
}