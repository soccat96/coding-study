package kr.soc.programmers

class NumberKth {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()

        for (command in commands) {
            val start = command[0] - 1
            val end = command[1]
            val nth = command[2] - 1

            val copy = array.copyOfRange(start, end)
            copy.sort()
            answer.add(copy[nth])
        }

        return answer.toIntArray()
    }
}