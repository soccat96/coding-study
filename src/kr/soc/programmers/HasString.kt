package kr.soc.programmers

class HasString {
    fun solution(str1: String, str2: String): Int {
        return if (str1.contains(str2)) 1 else 2
    }
}