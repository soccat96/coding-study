package kr.soc.programmers

import kotlin.math.*

class GreatestFactorLeastMultiple {
    fun solution(n: Int, m: Int): IntArray {
        val list = mutableListOf<Int>()
        val min = min(n, m)
        val max = max(n, m)

        for (x in min downTo 1) {
            if (n % x == 0 && m % x == 0) {
                list.add(x)
                break
            }
        }
        for (x in max..n*m) {
            if (x % n == 0 && x % m == 0) {
                list.add(x)
                break
            }
        }

        return list.toIntArray()
    }
}