package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CokeQuizTest {
    @Test
    fun test() {
//        2	1	20	19
//        3	1	20	9
        val cokeQuiz = CokeQuiz()
        assertThat(cokeQuiz.solution(2, 1, 20)).isEqualTo(19)
        assertThat(cokeQuiz.solution(3, 1, 20)).isEqualTo(9)
    }
}