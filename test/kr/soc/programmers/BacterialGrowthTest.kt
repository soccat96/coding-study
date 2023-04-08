package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.math.pow

class BacterialGrowthTest {
    @Test
    fun test() {
        val bacterialGrowth = BacterialGrowth()
        assertThat(bacterialGrowth.solution(2, 10)).isEqualTo(2048)
        assertThat(bacterialGrowth.solution(7, 15)).isEqualTo(229376)
    }
}