package kr.soc.programmers

class SumMeasure {
    fun solution(n: Int): Int {
        var answer = 0

        for (x in 1..n) {
            if (n % x == 0) answer += x
        }

        return answer
    }
}