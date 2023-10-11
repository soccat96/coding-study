package kr.soc.programmers

class CommonMultiplesLessN {
    fun solution(arr: IntArray): Int {
        val max = arr.maxOrNull()!!
        var cnt = 1

        while (true) {
            val num = max * cnt++
            var flag = true

            for (i in arr) {
                if (num % i != 0) {
                    flag = false
                    break
                }
            }

            if (flag) return num
        }
    }
}