package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MemoryScoreKtTest {

    @Test
    fun assertThatTest() {
        assertThat("a").isEqualTo("a")
    }
    @Test
    fun test() {
//        ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]	[19, 15, 6]
//        ["kali", "mari", "don"]	[11, 1, 55]	[["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]	[67, 0, 55]
//        ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may"],["kein", "deny", "may"], ["kon", "coni"]]	[5, 15, 0]
        val memoryScoreKt = MemoryScoreKt()
        assertArrayEquals(
            memoryScoreKt.solution(
                arrayOf("may", "kein", "kain", "radi"),
                intArrayOf(5, 10, 1, 3),
                arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni"))
            ), intArrayOf(19, 15, 6)
        )
        assertArrayEquals(
            memoryScoreKt.solution(
                arrayOf("kali", "mari", "don"),
                intArrayOf(11, 1, 55),
                arrayOf(arrayOf("kali", "mari", "don"), arrayOf("pony", "tom", "teddy"), arrayOf("con", "mona", "don"))
            ), intArrayOf(67, 0, 55)
        )
        assertArrayEquals(
            memoryScoreKt.solution(
                arrayOf("may", "kein", "kain", "radi"),
                intArrayOf(5, 10, 1, 3),
                arrayOf(arrayOf("may"), arrayOf("kein", "deny", "may"), arrayOf("kon", "coni"))
            ), intArrayOf(5, 15, 0)
        )
    }
}