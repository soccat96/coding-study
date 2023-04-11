package kr.soc.programmers

class SumEachChar {
    fun solution(n: Int): Int {
        var answer = 0
        n.toString().forEach { answer += it.digitToInt() }
        return answer
    }
}