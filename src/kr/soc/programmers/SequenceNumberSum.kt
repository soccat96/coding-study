package kr.soc.programmers

class SequenceNumberSum {
    fun solution(num: Int, total: Int): IntArray {
        val min = -100
        val list = mutableListOf<Int>()
        for (x in min..total) {
            var sum = 0
            list.clear()
            for (y in x until x+num) {
                sum += y
                list.add(y)
            }

            if (total == sum) break
        }

        return list.toIntArray()
    }
}