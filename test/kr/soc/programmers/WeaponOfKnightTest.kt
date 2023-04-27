package kr.soc.programmers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class WeaponOfKnightTest {
    @Test
    fun test() {
//        5	3	2	10
//        10	3	2	21
        val weaponOfKnight = WeaponOfKnight()
        assertThat(weaponOfKnight.solution(5, 3, 2)).isEqualTo(10)
        assertThat(weaponOfKnight.solution(10, 3, 2)).isEqualTo(21)
    }
}