package kr.soc.programmers

class Courses30lessons42839kt {
    fun solution(numbers: String): Int {
        val numberList = numbers.toCharArray().map { it.toString() }
        val numberSet = mutableSetOf<Int>()

        recursion(numberSet, numberList, mutableListOf<Int>(), "")

        var cnt = 0
        for (x in numberSet) {
            if (isPrimeNumber(x)) {
                cnt++
            }
        }

        return cnt
    }

    private fun isPrimeNumber(x: Int): Boolean {
        if (x == 0 || x == 1) {
            return false
        }

        var y = 2
        while (y < x) {
            if (x % y == 0) {
                return false
            }

            y++
        }

        return true
    }

    private fun recursion(numberSet: MutableSet<Int>, numberList: List<String>, indexArray: MutableList<Int>, s: String) {
        for (i in numberList.indices) {
            if (indexArray.contains(i)) { continue }

            val str = s + numberList[i]
            numberSet.add(str.toInt())
            indexArray.add(i)

            recursion(numberSet, numberList, indexArray, str)

            indexArray.remove(i)
        }
    }
}