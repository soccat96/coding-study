package kr.soc.programmers

class RemoveSmallest {
    fun solution(arr: IntArray): IntArray {
        val result = mutableListOf<Int>()
        var min = Int.MAX_VALUE

        for (x in arr) {
            if (x < min) min = x
        }
        for (x in arr) {
            if (x != min) result.add(x)
        }

        return if (result.size == 0) intArrayOf(-1) else result.toIntArray()
    }
}