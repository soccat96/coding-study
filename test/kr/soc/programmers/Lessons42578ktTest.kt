package kr.soc.programmers

import kr.soc.programmers.Lessons42578kt
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Lessons42578ktTest {

    @Test
    fun solution() {
        val c = kr.soc.programmers.Lessons42578kt()
        assertEquals(5,
                c.solution(arrayOf(
                        arrayOf("yellowhat", "headgear"),
                        arrayOf("bluesunglasses", "eyewear"),
                        arrayOf("green_turban", "headgear"))
                )
        )
        assertEquals(3,
                c.solution(arrayOf(
                        arrayOf("crowmask", "face"),
                        arrayOf("bluesunglasses", "face"),
                        arrayOf("smoky_makeup", "face"))
                )
        )
    }
}