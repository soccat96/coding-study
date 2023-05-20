package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TernarySystemTest {
    @Test
    fun test() {
//        45	7
//        125	229
        val ternarySystem = TernarySystem()
        assertThat(ternarySystem.solution(45)).isEqualTo(7)
        assertThat(ternarySystem.solution(125)).isEqualTo(229)
    }
}