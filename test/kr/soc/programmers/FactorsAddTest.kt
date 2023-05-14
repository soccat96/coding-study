package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FactorsAddTest {
    @Test
    fun test() {
//        13	17	43
//        24	27	52
        val factorsAdd = FactorsAdd()
        assertThat(factorsAdd.solution(13, 17)).isEqualTo(43)
        assertThat(factorsAdd.solution(24, 27)).isEqualTo(52)
    }
}