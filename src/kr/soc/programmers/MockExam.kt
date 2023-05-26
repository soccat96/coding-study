package kr.soc.programmers

import java.util.*

class MockExam {
    fun solution(answers: IntArray): IntArray {
        val answers1 = mutableListOf<Int>()
        val answers2 = mutableListOf<Int>()
        val answers3 = mutableListOf<Int>()
        val pattern1 = intArrayOf(1, 2, 3, 4, 5).toList()
        val pattern2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5).toList()
        val pattern3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5).toList()

        val answersSize = answers.size
        while (answers1.size < answersSize) answers1.addAll(pattern1)
        while (answers2.size < answersSize) answers2.addAll(pattern2)
        while (answers3.size < answersSize) answers3.addAll(pattern3)

        val cut1 = answers1.subList(0, answersSize)
        val cut2 = answers2.subList(0, answersSize)
        val cut3 = answers3.subList(0, answersSize)
        var correct1 = 0
        var correct2 = 0
        var correct3 = 0
        for ((i, x) in answers.withIndex()) {
            if (x == cut1[i]) correct1++
            if (x == cut2[i]) correct2++
            if (x == cut3[i]) correct3++
        }

        val returnList = mutableListOf<Int>()
        val map = mapOf(1 to correct1, 2 to correct2, 3 to correct3)
        val treeSet = TreeSet<Int>()
        treeSet.addAll(intArrayOf(correct1, correct2, correct3).toList())
        val best = treeSet.last()
        for (x in map) {
            if (x.value == best) returnList.add(x.key)
        }
        returnList.sort()

        return returnList.toIntArray()
    }
}