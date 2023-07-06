package kr.soc.programmers

import kotlin.math.max
import kotlin.math.min

class SumBetweenIntAndInt {
    fun solution(a: Int, b: Int): Long {
        if (a == b) return a.toLong()

        var sum = 0L
        for (x in min(a, b)..max(a, b)) {
            sum += x
        }
        return sum
    }
}