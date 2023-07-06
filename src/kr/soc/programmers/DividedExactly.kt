package kr.soc.programmers

class DividedExactly {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val list = mutableListOf<Int>()
        for (x in arr) {
            if (x % divisor == 0) list.add(x)
        }
        list.sort()

        return if (list.isEmpty()) {
            intArrayOf(-1)
        } else {
            list.toIntArray()
        }
    }
}