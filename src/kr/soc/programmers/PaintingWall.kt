package kr.soc.programmers

class PaintingWall {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var cnt = 0
        var end = 0

        for (x in section) {
            if (x > end) {
                cnt++
                end = x + m - 1
            }
        }

        return cnt
    }
}