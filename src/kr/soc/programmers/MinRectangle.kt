package kr.soc.programmers

import java.util.*
import kotlin.math.max
import kotlin.math.min

class MinRectangle {
    fun solution(sizes: Array<IntArray>): Int {
        val xSet = TreeSet<Int>()
        val ySet = TreeSet<Int>()

        for (arr in sizes) {
            xSet.add(max(arr[0], arr[1]))
            ySet.add(min(arr[0], arr[1]))
        }

        return xSet.last() * ySet.last()
    }
}