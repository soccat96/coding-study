package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberStringAndEnglishWordTest {
    @Test
    fun test() {
//        "one4seveneight"	1478
//        "23four5six7"	234567
//        "2three45sixseven"	234567
//        "123"	123
        val numberStringAndEnglishWord = NumberStringAndEnglishWord()
        assertThat(numberStringAndEnglishWord.solution("one4seveneight")).isEqualTo(1478)
        assertThat(numberStringAndEnglishWord.solution("23four5six7")).isEqualTo(234567)
        assertThat(numberStringAndEnglishWord.solution("2three45sixseven")).isEqualTo(234567)
        assertThat(numberStringAndEnglishWord.solution("123")).isEqualTo(123)
    }
}