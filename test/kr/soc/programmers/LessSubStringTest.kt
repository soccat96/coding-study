package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LessSubStringTest {
    @Test
    fun test() {
//        "3141592"	"271"	2
//        "500220839878"	"7"	8
//        "10203"	"15"	3
        val lessSubString = LessSubString()
        assertThat(lessSubString.solution("3141592", "271")).isEqualTo(2)
        assertThat(lessSubString.solution("500220839878", "7")).isEqualTo(8)
        assertThat(lessSubString.solution("10203", "15")).isEqualTo(3)
    }

    @Test
    fun testtest() {
        assertThat("02".toInt()).isEqualTo(2)
    }
}