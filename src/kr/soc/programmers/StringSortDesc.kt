package kr.soc.programmers

class StringSortDesc {
    fun solution(s: String): String {
        val arr = s.toCharArray()
        arr.sortDescending()
        return arr.joinToString("")
    }
}