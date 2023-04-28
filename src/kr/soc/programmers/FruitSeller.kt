package kr.soc.programmers

import kotlin.math.min

class FruitSeller {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer = 0

        val arrayDeque = ArrayDeque(score.toMutableList().sortedDescending())
        while (arrayDeque.size >= m) {
            val end = min(m, arrayDeque.size)
            var min = Int.MAX_VALUE
            for (x in 1..end) {
                val first = arrayDeque.removeFirst()
                if (first < min) {
                    min = first
                }
            }

            answer += min * m
        }

        return answer
    }
}