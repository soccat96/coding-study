package kr.soc.programmers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class RoughKeyboardTest {
    @Test
    fun test() {
//        ["ABACD", "BCEFD"]	["ABCD","AABB"]	[9, 4]
//        ["AA"]	["B"]	[-1]
//        ["AGZ", "BSSS"]	["ASA","BGZ"]	[4, 6]
        val roughKeyboard = RoughKeyboard()
        assertThat(roughKeyboard.solution(arrayOf("ABACD", "BCEFD"), arrayOf("ABCD","AABB"))).isEqualTo(intArrayOf(9, 4))
        assertThat(roughKeyboard.solution(arrayOf("AA"), arrayOf("BB"))).isEqualTo(intArrayOf(-1))
        assertThat(roughKeyboard.solution(arrayOf("AGZ", "BSSS"), arrayOf("ASA", "BGZ"))).isEqualTo(intArrayOf(4, 6))
    }
}