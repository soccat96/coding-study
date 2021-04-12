package kr.soc.programmers

import java.util.*

class Courses30lessons68644kt {
    fun solution(numbers: IntArray): IntArray {
        val treeSet = TreeSet<Int>();
        for(i in numbers.indices) {
            val x = numbers[i];
            for(j in numbers.indices) {
                if(i != j) {
                    treeSet.add(x + numbers[j]);
                }
            }
        }

        return treeSet.toIntArray()
    }
}