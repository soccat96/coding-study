package kr.soc.programmers

import kotlin.math.max

class HallOfFame {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = mutableListOf<Int>()

        val list = mutableListOf<Int>()
        for (x in score) {
            list.add(x)
            list.sort()

            val start = list.size - k
            val subList = list.toList().subList(max(0, start), list.size)
            answer.add(subList.first())

            list.clear()
            list.addAll(subList)
        }

        return answer.toIntArray()
    }
}