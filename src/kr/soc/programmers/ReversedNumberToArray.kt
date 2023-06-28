package kr.soc.programmers

class ReversedNumberToArray {
    fun solution(n: Long): IntArray {
//        val list = mutableListOf<Int>()
//        n.toString().reversed().forEach { list.add(it.digitToInt()) }
//        return list.toIntArray()

         return n.toString().reversed().map { it.digitToInt() }.toIntArray()
    }
}