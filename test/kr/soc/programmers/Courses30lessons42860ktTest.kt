package kr.soc.programmers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Courses30lessons42860ktTest {

    @Test
    fun solution() {
        val c = Courses30lessons42860kt()
        assertEquals(56, c.solution("JEROEN"))
        assertEquals(23, c.solution("JAN"))
        assertEquals(4, c.solution("BAABA"))
        assertEquals(0, c.solution("AAAAA"))
        assertEquals(8, c.solution("ZZAAAZZ"))
    }
}