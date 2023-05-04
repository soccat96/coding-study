package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberCoupleTest {
    @Test
    fun test() {
//        "100"	"2345"	"-1"
//        "100"	"203045"	"0"
//        "100"	"123450"	"10"
//        "12321"	"42531"	"321"
//        "5525"	"1255"	"552"
        val numberCouple = NumberCouple()
        assertThat(numberCouple.solution("100", "2345")).isEqualTo("-1")
        assertThat(numberCouple.solution("100", "203045")).isEqualTo("0")
        assertThat(numberCouple.solution("100", "123450")).isEqualTo("10")
        assertThat(numberCouple.solution("12321", "42531")).isEqualTo("321")
        assertThat(numberCouple.solution("5525", "1255")).isEqualTo("552")
    }
}