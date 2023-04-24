package kr.soc.programmers

class ClosestChar {
    fun solution(s: String): IntArray {
        val answer = mutableListOf<Int>()
        val map = mutableMapOf<Char, Int>()

        for ((i, ch) in s.withIndex()) {
            if (map.containsKey(ch)) {
                answer.add(i - map.getValue(ch))
            } else {
                answer.add(-1)
            }

            map[ch] = i
        }


        return answer.toIntArray()
    }
}