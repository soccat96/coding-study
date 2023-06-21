package kr.soc.programmers

class SortLongNumber {
    fun solution(n: Long): Long {
        val toCharArray = n.toString().toCharArray()
        toCharArray.sortDescending()
        val joinToString = toCharArray.joinToString("")
        return joinToString.toLong()
    }
}