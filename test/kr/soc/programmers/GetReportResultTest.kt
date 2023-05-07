package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GetReportResultTest {
    @Test
    fun test() {
//        ["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
//        ["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]
        val getReportResult = GetReportResult()
        assertThat(getReportResult.solution(
            arrayOf("muzi", "frodo", "apeach", "neo"),
            arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"),
            2
        )).isEqualTo(intArrayOf(2,1,1,0))
        assertThat(getReportResult.solution(
            arrayOf("con", "ryan"),
            arrayOf("ryan con", "ryan con", "ryan con", "ryan con"),
            3
        )).isEqualTo(intArrayOf(0,0))
    }
}