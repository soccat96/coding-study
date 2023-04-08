package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SortStringTest {
    @Test
    fun test() {
//        "Bcad"	"abcd"
//        "heLLo"	"ehllo"
//        "Python"	"hnopty"
        val sortString = SortString()
        assertThat(sortString.solution("Bcad")).isEqualTo("abcd")
        assertThat(sortString.solution("heLLo")).isEqualTo("ehllo")
        assertThat(sortString.solution("Python")).isEqualTo("hnopty")
    }
}