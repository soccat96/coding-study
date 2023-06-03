package kr.soc.programmers

class SumOfProcession {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val array = Array(arr1.size) { IntArray(arr1[0].size) }

        for (x in array.indices) {
            for (y in array[0].indices) {
                array[x][y] = arr1[x][y] + arr2[x][y]
            }
        }

        return array
    }
}