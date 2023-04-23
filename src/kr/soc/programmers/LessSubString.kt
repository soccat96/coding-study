package kr.soc.programmers

class LessSubString {
    fun solution(t: String, p: String): Int {
        var answer = 0
        val pNum = p.toLong()

        for ((i, _) in t.withIndex()) {
            val end = i + p.length
            if (end > t.length) {
                break
            }

            if (t.substring(i, end).toLong() <= pNum) {
                answer++
            }
        }

        return answer
    }
}