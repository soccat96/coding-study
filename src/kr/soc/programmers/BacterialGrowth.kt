package kr.soc.programmers

import kotlin.math.pow

class BacterialGrowth {
    fun solution(n: Int, t: Int): Int {
        var answer: Int = n
        repeat(t) { answer *= 2 }
        return answer
    }
}