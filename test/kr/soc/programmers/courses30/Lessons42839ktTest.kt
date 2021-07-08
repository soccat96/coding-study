package kr.soc.programmers.courses30

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Lessons42839ktTest {

    @Test
    fun solution() {
        val c = Lessons42839kt()
        assertEquals(3, c.solution("17"))
        assertEquals(2, c.solution("011"))
        assertEquals(12345678, "0012345678".toInt())
        assertEquals(12003400, "0012003400".toInt())
    }
}