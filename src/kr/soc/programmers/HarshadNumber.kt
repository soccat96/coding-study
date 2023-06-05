package kr.soc.programmers

class HarshadNumber {
    fun solution(x: Int): Boolean {
        var sum = 0
        x.toString().forEach { sum += it.digitToInt() }

        return x % sum == 0
    }
}