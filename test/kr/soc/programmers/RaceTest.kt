package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RaceTest {
    @Test
    fun test() {
//        ["mumu", "soe", "poe", "kai", "mine"]
//        ["kai", "kai", "mine", "mine"]
//        ["mumu", "kai", "mine", "soe", "poe"]

        val race = Race()
        assertThat(race.solution(
            arrayOf("mumu", "soe", "poe", "kai", "mine"),
            arrayOf("kai", "kai", "mine", "mine")))
            .isEqualTo(arrayOf("mumu", "kai", "mine", "soe", "poe"))

    }
}