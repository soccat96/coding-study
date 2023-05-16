package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddPlusMinusTest {
    @Test
    fun test() {
//        [4,7,12]	[true,false,true]	9
//        [1,2,3]	[false,false,true]	0
        val addPlusMinus = AddPlusMinus()
        assertThat(addPlusMinus.solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true))).isEqualTo(9)
        assertThat(addPlusMinus.solution(intArrayOf(1, 2, 3), booleanArrayOf(false, false, true))).isEqualTo(0)
    }
}