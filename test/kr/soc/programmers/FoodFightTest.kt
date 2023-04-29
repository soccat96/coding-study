package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FoodFightTest {
    @Test
    fun test() {
//        [1, 3, 4, 6]	"1223330333221"
//        [1, 7, 1, 2]	"111303111"
        val foodFight = FoodFight()
        assertThat(foodFight.solution(intArrayOf(1, 3, 4, 6))).isEqualTo("1223330333221")
        assertThat(foodFight.solution(intArrayOf(1, 7, 1, 2))).isEqualTo("111303111")
    }
}