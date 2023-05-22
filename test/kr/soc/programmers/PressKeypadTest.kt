package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PressKeypadTest {
    @Test
    fun test() {
//        [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
//        [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
//        [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	"right"	"LLRLLRLLRL"
        val pressKeypad = PressKeypad()
        assertThat(pressKeypad.solution(intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5), "right")).isEqualTo("LRLLLRLLRRL")
        assertThat(pressKeypad.solution(intArrayOf(7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2), "left")).isEqualTo("LRLLRRLLLRR")
        assertThat(pressKeypad.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0), "right")).isEqualTo("LLRLLRLLRL")
    }
}