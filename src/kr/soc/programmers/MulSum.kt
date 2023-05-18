package kr.soc.programmers

class MulSum {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer = 0

        a.forEachIndexed { index, i -> answer += i * b[index] }

        return answer
    }
}