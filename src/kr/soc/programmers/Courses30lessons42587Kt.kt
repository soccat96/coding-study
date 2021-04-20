package kr.soc.programmers

class Courses30lessons42587Kt {
    fun solution(priorities: IntArray, location: Int): Int {
        data class Document(val priority: Int, val location: Int)

        val resultList = mutableListOf<Document>()
        val queueList = mutableListOf<Document>();

        priorities.forEachIndexed { i, e -> queueList.add(Document(priority = e, location = i)) }

        while (queueList.isNotEmpty()) {
            val first = queueList.first()
            queueList.removeFirst()
            if(queueList.isNotEmpty()
                    && first.priority < queueList.maxByOrNull { it.priority }!!.priority) {
                queueList.add(first)
                continue
            }

            resultList.add(first)
        }

        return resultList.indexOf(resultList.find { it.location == location }) + 1
    }
}