package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QuizOXTest {
    @Test
    fun test() {
//        ["3 - 4 = -3", "5 + 6 = 11"]	["X", "O"]
//        ["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]	["O", "O", "X", "O"]
        val quizOX = QuizOX()
        assertThat(quizOX.solution(arrayOf("3 - 4 = -3", "5 + 6 = 11"))).isEqualTo(arrayOf("X", "O"))
        assertThat(quizOX.solution(arrayOf("19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"))).isEqualTo(arrayOf("O", "O", "X", "O"))
    }
}