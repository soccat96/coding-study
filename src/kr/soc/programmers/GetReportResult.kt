package kr.soc.programmers

class GetReportResult {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer = Array(id_list.size) {0}

        val idReport = mutableMapOf<String, MutableSet<String>>()
        val reportedId = mutableMapOf<String, MutableList<String>>()
        val reportedCount = mutableMapOf<String, Int>()
        id_list.forEach {
            idReport[it] = mutableSetOf()
            reportedId[it] = mutableListOf()
            reportedCount[it] = 0
        }

        for (x in report) {
            val split = x.split(" ")
            idReport[split[0]]!!.add(split[1])

            val revengeList = reportedId[split[1]]!!
            if (!revengeList.contains(split[0])) {
                revengeList.add(split[0])
                reportedCount[split[1]] = reportedCount[split[1]]!! + 1
            }
        }

        for ((i, x) in id_list.withIndex()) {
            val idSet = idReport[x]!!
            for (id in idSet) {
                if (reportedCount[id]!! >= k) answer[i]++
            }
        }

        return answer.toIntArray()
    }
}