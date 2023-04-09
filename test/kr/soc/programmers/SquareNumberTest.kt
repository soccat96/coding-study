package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SquareNumberTest {
    @Test
    fun test() {
//        144	1
//        976	2
        val squareNumber = SquareNumber()
        assertThat(squareNumber.solution(144)).isEqualTo(1)
        assertThat(squareNumber.solution(976)).isEqualTo(2)
    }
}