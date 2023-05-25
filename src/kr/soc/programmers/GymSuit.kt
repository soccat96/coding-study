package kr.soc.programmers

class GymSuit {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

        val realReserve = reserve.filter { !lost.contains(it) }.toMutableList()
        val realLost = lost.filter { !reserve.contains(it) }.toList()
        for (student in 1..n) {
            if (realLost.contains(student)) {
                val before = student - 1
                val next = student + 1

                val beforeIndex = realReserve.indexOf(before)
                val nextIndex = realReserve.indexOf(next)
                if (beforeIndex >= 0) {
                    realReserve.removeAt(beforeIndex)
                    answer++
                } else if (nextIndex >= 0) {
                    realReserve.removeAt(nextIndex)
                    answer++
                }
            } else {
                answer++
            }
        }

        return answer
    }
}