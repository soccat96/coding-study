package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StringShiftTest {
    @Test
    fun test() {
//        "hello"	"ohell"	1
//        "apple"	"elppa"	-1
//        "atat"	"tata"	1
//        "abc"	"abc"	0
        val stringShift = StringShift()
        assertThat(stringShift.solution("hello", "ohell")).isEqualTo(1)
        assertThat(stringShift.solution("apple", "elppa")).isEqualTo(-1)
        assertThat(stringShift.solution("atat", "tata")).isEqualTo(1)
        assertThat(stringShift.solution("abc", "abc")).isEqualTo(0)
    }
}