package kr.soc.programmers

class NextNumber {
    fun solution(common: IntArray): Int {
        val lastGap = common.last() - common[common.size - 2]
        val firstGap = common[1] - common.first()
        return if (firstGap == lastGap) {
            common.last() + firstGap
        } else {
            common.last() * (common[1] / common.first())
        }
    }
}