package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CutStringToArrayTest {
    @Test
    fun test() {
//        "abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
//        "abcdef123"	3	["abc", "def", "123"]
        val cutStringToArray = CutStringToArray()
        assertThat(cutStringToArray.solution("abc1Addfggg4556b", 6)).isEqualTo(arrayOf("abc1Ad", "dfggg4", "556b"))
        assertThat(cutStringToArray.solution("abcdef123", 3)).isEqualTo(arrayOf("abc", "def", "123"))
    }
}