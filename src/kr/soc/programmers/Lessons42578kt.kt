package kr.soc.programmers

class Lessons42578kt {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val map = mutableMapOf<String, MutableList<String>>()

        clothes.forEach {
            if(map[it[1]].isNullOrEmpty()) map[it[1]] = mutableListOf<String>()
            map[it[1]]!!.add(it[0])
        }

        map.keys.forEach { answer *= map[it]!!.size + 1 }

        return answer - 1
    }

//    fun solution(clothes: Array<Array<String>>): Int {
//        return clothes.groupBy { it[1] }.values.fold(1) { acc, v -> acc * (v.size + 1) }  - 1
//    }
}