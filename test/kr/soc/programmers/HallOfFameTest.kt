package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HallOfFameTest {
    @Test
    fun test() {
        //    3	[10, 100, 20, 150, 1, 100, 200]	[10, 10, 10, 20, 20, 100, 100]
        //    4	[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]	[0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
        val hallOfFame = HallOfFame()
        assertThat(hallOfFame.solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)))
            .isEqualTo(intArrayOf(10, 10, 10, 20, 20, 100, 100))
        assertThat(hallOfFame.solution(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)))
            .isEqualTo(intArrayOf(0, 0, 0, 0, 20, 40, 70, 70, 150, 300))
    }
}
