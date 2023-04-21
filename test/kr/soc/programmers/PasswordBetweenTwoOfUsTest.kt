package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PasswordBetweenTwoOfUsTest {
    @Test
    fun test() {
//        "aukks"	"wbqd"	5	"happy"
        val us = PasswordBetweenTwoOfUs()
        assertThat(us.solution("aukks", "wbqd", 5)).isEqualTo("happy")
    }
}