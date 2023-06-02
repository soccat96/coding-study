package kr.soc.programmers

class TermxCountn {
    fun solution(x: Int, n: Int): LongArray {
        val answer = mutableListOf<Long>()

        var count = 1
        var xl = x.toLong()
        answer.add(xl)
        while (count != n) {
            xl += x
            answer.add(xl)
            count++
        }

        return answer.toLongArray()
    }
}