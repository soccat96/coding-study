package kr.soc.programmers

class SumEachCharacterNumber {
    fun solution(n: Int): Int {
        return n.toString().sumOf { it.digitToInt() }
    }
}