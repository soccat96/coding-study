package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SequenceNumberSumTest {
    @Test
    fun test() {
//        3	12	[3, 4, 5]
//        5	15	[1, 2, 3, 4, 5]
//        4	14	[2, 3, 4, 5]
//        5	5	[-1, 0, 1, 2, 3]
        val sequenceNumberSum = SequenceNumberSum()
        assertThat(sequenceNumberSum.solution(3, 12)).containsExactly(3, 4, 5)
        assertThat(sequenceNumberSum.solution(5, 15)).containsExactly(1, 2, 3, 4, 5)
        assertThat(sequenceNumberSum.solution(4, 14)).containsExactly(2, 3, 4, 5)
        assertThat(sequenceNumberSum.solution(5, 5)).containsExactly(-1, 0, 1, 2, 3)
        assertThat(sequenceNumberSum.solution(3, 0)).containsExactly(-1, 0, 1)
    }
}