package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CharacterTypeTestTest {
    @Test
    fun test() {
//        ["AN", "CF", "MJ", "RT", "NA"]	[5, 3, 2, 7, 5]	"TCMA"
//        ["TR", "RT", "TR"]	[7, 1, 3]	"RCJA"
        val characterTypeTest = CharacterTypeTest()
        assertThat(characterTypeTest.solution(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5))).isEqualTo("TCMA")
        assertThat(characterTypeTest.solution(arrayOf("TR", "RT", "TR"), intArrayOf(7, 1, 3))).isEqualTo("RCJA")
    }
}