package kr.soc.programmers

class GetReportResult {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer = Array(id_list.size) {0}

        val act = mutableMapOf<String, MutableSet<String>>()
        val react = mutableMapOf<String, MutableList<String>>()
        val count = mutableMapOf<String, Int>()
        id_list.forEach {
            act[it] = mutableSetOf()
            react[it] = mutableListOf()
            count[it] = 0
        }

        for (x in report) {
            val split = x.split(" ")
            act[split[0]]!!.add(split[1])

            val revengeList = react[split[1]]!!
            if (!revengeList.contains(split[0])) {
                revengeList.add(split[0])
                count[split[1]] = count[split[1]]!! + 1
            }
        }

        for ((i, x) in id_list.withIndex()) {
            val idSet = act[x]!!
            for (id in idSet) {
                if (count[id]!! >= k) answer[i]++
            }
        }

        return answer.toIntArray()
    }
}