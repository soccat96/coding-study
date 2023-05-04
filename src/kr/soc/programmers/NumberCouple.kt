package kr.soc.programmers

import java.util.*

class NumberCouple {
    fun solution(X: String, Y: String): String {
        val x = X.toList().map { it.digitToInt() }
        val y = Y.toList().map { it.digitToInt() }
        val xs = Stack<Int>()
        val ys = Stack<Int>()
        xs.addAll(x)
        ys.addAll(y)
        xs.sortDescending()
        ys.sortDescending()

        val list = mutableListOf<Int>()
        while (xs.isNotEmpty() && ys.isNotEmpty()) {
            val xp = xs.peek()
            val yp = ys.peek()

            if (xp < yp) {
                xs.pop()
                continue
            }

            if (xp > yp) {
                ys.pop()
                continue
            }

            if (xp == yp) {
                list.add(ys.pop())
                xs.pop()
            }
        }

        list.sortDescending()
        return if (list.isEmpty()) {
            "-1"
        } else {
            if (list.first() == 0) {
                "0"
            } else {
                list.joinToString("")
            }
        }

//        var answer = ""
//
//        for (ch in (9 downTo 0).toList().map { it.toString() }) {
//            val xc = X.count { it.toString() == ch }
//            val yc = Y.count { it.toString() == ch }
//            answer += ch.repeat(min(xc, yc))
//        }
//        if (answer.isEmpty()) answer = "-1"
//        if (answer.toList().distinct() == listOf('0')) answer = "0"
//
//        return answer
    }
}