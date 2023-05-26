package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockExamTest {
    @Test
    fun test() {
//        [1,2,3,4,5]	[1]
//        [1,3,2,4,2]	[1,2,3]
        val mockExam = MockExam()
        assertThat(mockExam.solution(intArrayOf(1, 2, 3, 4, 5))).isEqualTo(intArrayOf(1))
        assertThat(mockExam.solution(intArrayOf(1, 3, 2, 4, 2))).isEqualTo(intArrayOf(1, 2, 3))
    }
}