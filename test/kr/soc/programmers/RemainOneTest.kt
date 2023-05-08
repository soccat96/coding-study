package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RemainOneTest {
    @Test
    fun test() {
//        10	3
//        12	11
        val remainOne = RemainOne()
        assertThat(remainOne.solution(10)).isEqualTo(3)
        assertThat(remainOne.solution(12)).isEqualTo(11)
    }
}