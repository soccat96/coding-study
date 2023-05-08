package kr.soc.programmers

class RemainOne {
    fun solution(n: Int): Int {
        var x = 1
        while (true) {
            if (n % x == 1) return x
            x++
        }
    }
}