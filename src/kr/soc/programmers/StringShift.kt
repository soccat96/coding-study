package kr.soc.programmers

class StringShift {
    fun solution(A: String, B: String): Int {
        if (A == B) return 0

        var str = A
        var cnt = 1
        var flag = false
        for (x in A.indices) {
            str = str.last() + str.substring(0, str.length - 1)

            if (str == B) {
                flag = true
                break
            }

            cnt++
        }

        return if (flag) cnt else -1
    }
}