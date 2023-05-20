package kr.soc.programmers

import kotlin.math.pow

class TernarySystem {
    fun solution(n: Int): Int {
//        return n.toString(3).reversed().toInt(3)
        if (n < 3) return n

        val list = mutableListOf<Int>()
        var x = n
        do {
            list.add(x % 3)
            x /= 3
        } while (x >= 3)
        list.add(x)

        list.reverse()
        var sum = 0
        for ((i, num) in list.withIndex()) {
            if (i == 0) {
                sum += num
                continue
            }

            sum += num * 3.0.pow(i.toDouble()).toInt()
        }

        return sum
    }
}