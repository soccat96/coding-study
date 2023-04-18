package kr.soc.programmers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class PaintingWallTest {
    @Test
    fun test() {
//        8	4	[2, 3, 6]	2
//        5	4	[1, 3]	1
//        4	1	[1, 2, 3, 4]	4
        val paintingWall = PaintingWall()
        assertThat(paintingWall.solution(8, 4, intArrayOf(2, 3, 6))).isEqualTo(2)
        assertThat(paintingWall.solution(5, 4, intArrayOf(1, 3))).isEqualTo(1)
        assertThat(paintingWall.solution(4, 1, intArrayOf(1, 2, 3, 4))).isEqualTo(4)
    }
}