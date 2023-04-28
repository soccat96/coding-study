package kr.soc.programmers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class FruitSellerTest {
    @Test
    fun test() {
//        3	4	[1, 2, 3, 1, 2, 3, 1]	8
//        4	3	[4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]	33
        val fruitSeller = FruitSeller()
        assertThat(fruitSeller.solution(3, 4, intArrayOf(1, 2, 3, 1, 2, 3, 1))).isEqualTo(8)
        assertThat(fruitSeller.solution(4, 3, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2))).isEqualTo(33)
    }
}