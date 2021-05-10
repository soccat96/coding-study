package kr.soc.programmers

class Courses30lessons42839kt {
    companion object {
        var numberSet = mutableSetOf<Int>()
        var charNumberList: List<String>? = null
    }

    fun solution(numbers: String): Int {
        charNumberList = numbers.toCharArray().map { it.toString() }
        numberSet.clear()

        recursion(mutableListOf<Int>(), "")

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

    private fun recursion(indexArray: MutableList<Int>, s: String) {
        for (i in charNumberList!!.indices) {
            if (indexArray.contains(i)) { continue }

            val str = s + charNumberList!![i]
            numberSet.add(str.toInt())
            indexArray.add(i)

            recursion(indexArray, str)

            indexArray.remove(i)
        }
    }
}