package kr.soc.programmers

class SortString {
    fun solution(my_string: String): String {
        return my_string.lowercase().toList().sortedBy { it }.joinToString("")
    }
}