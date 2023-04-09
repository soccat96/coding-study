package kr.soc.programmers

import kotlin.math.sqrt

class SquareNumber {
    fun solution(n: Int): Int {
//        return if(sqrt(n.toDouble()).toString().split(".")[1] == "0") 1 else 2
        val toLong = sqrt(n.toDouble()).toLong()
        return if(toLong * toLong == n.toLong()) 1 else 2
    }
}