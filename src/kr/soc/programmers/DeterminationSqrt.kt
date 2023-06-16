package kr.soc.programmers

class DeterminationSqrt {
    fun solution(n: Long): Long {
        var answer = -1L
        if (n == 1L) return 4

        for (x in 1..n/2) {
            if (x * x == n) {
                answer = (x+1) * (x+1)
                break
            }
        }

        return answer
    }
}