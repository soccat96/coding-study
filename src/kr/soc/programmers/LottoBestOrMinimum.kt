package kr.soc.programmers

import kotlin.math.min

class LottoBestOrMinimum {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val rank = mapOf(6 to 1, 5 to 2, 4 to 3, 3 to 4, 2 to 5, 1 to 6, 0 to 6)
        var zeroCount = 0
        var correctCount = 0
        val winList = win_nums.toMutableList()

        lottos.forEach {
            if (it == 0) {
                zeroCount++
            }
            if (winList.contains(it)) {
                correctCount++
                winList.remove(it)
            }
        }

        return intArrayOf(rank[correctCount + min(zeroCount, winList.size)]!!, rank[correctCount]!!)
    }
}