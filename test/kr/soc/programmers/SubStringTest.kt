package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubStringTest {
    @Test
    fun test() {
//        "banana"	3
//        "abracadabra"	6
//        "aaabbaccccabba"	3
        val subString = SubString()
        assertThat(subString.solution("banana")).isEqualTo(3)
        assertThat(subString.solution("abracadabra")).isEqualTo(6)
        assertThat(subString.solution("aaabbaccccabba")).isEqualTo(3)
    }
}