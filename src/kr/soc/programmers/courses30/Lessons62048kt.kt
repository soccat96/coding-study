package kr.soc.programmers.courses30

import kotlin.math.floor

class Lessons62048kt {
    fun solution(w: Int, h: Int): Long {
        var answer: Long = 0

        for (i in 1 until w) {
            answer += floor(h.toDouble() * i / w.toDouble()).toLong()
        }

        return answer * 2
    }
}