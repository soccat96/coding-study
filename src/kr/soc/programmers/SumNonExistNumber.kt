package kr.soc.programmers

class SumNonExistNumber {
    fun solution(numbers: IntArray): Int {
        return intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).filter { !numbers.contains(it) }.sum()
    }
}