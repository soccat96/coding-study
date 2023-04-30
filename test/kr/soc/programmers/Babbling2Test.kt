package kr.soc.programmers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class Babbling2Test {
    @Test
    fun test() {
//        ["aya", "yee", "u", "maa"]	1
//        ["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]	2
        val babbling2 = Babbling2()
        assertThat(babbling2.solution(arrayOf("aya", "yee", "u", "maa"))).isEqualTo(1)
        assertThat(babbling2.solution(arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"))).isEqualTo(2)
    }
}