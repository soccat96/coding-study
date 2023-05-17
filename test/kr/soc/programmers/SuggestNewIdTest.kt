package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SuggestNewIdTest {
    @Test
    fun test() {
//        "...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
//        "z-+.^."	"z--"
//        "=.="	"aaa"
//        "123_.def"	"123_.def"
//        "abcdefghijklmn.p"	"abcdefghijklmn"
        val suggestNewId = SuggestNewId()
        assertThat(suggestNewId.solution("...!@BaT#*..y.abcdefghijklm")).isEqualTo("bat.y.abcdefghi")
        assertThat(suggestNewId.solution("z-+.^.")).isEqualTo("z--")
        assertThat(suggestNewId.solution("=.=")).isEqualTo("aaa")
        assertThat(suggestNewId.solution("123_.def")).isEqualTo("123_.def")
        assertThat(suggestNewId.solution("abcdefghijklmn.p")).isEqualTo("abcdefghijklmn")
    }
}