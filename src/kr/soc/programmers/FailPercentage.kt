package kr.soc.programmers

class FailPercentage {
    fun solution(N: Int, stages: IntArray): IntArray {
        val map = mutableMapOf<Int, Double>()

        for (stageLevel in 1..N) {
            var userSize = 0.0
            var failCount = 0
            for (x in stages) {
                if (x >= stageLevel) {
                    userSize++
                    if (x <= stageLevel) failCount++
                }
            }

            map[stageLevel] = if (userSize == 0.0) {
                0.0
            } else {
                failCount / userSize
            }

        }

        return map.toList().sortedByDescending { it.second }.map { it.first }.toIntArray()
    }
}