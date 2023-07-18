package kr.soc.programmers

class MinMax {
    fun solution(s: String): String {
        val split = s.split(" ")
        val list = mutableListOf<Int>()
        for (x in split) {
            list.add(x.toInt())
        }
        list.sort()

        return "${list.first()} ${list.last()}"
//        fun solution(s: String): String = s.split(" ").map { it.toInt() }.let { "${it.min()} ${it.max()}" }
    }
}