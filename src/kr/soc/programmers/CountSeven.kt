package kr.soc.programmers

class CountSeven {
    fun solution(array: IntArray): Int {
//        var cnt = 0
//        for (x in array) {
//            for (y in x.toString()) {
//                if (y == '7') {
//                    cnt++
//                }
//            }
//        }
//
//        return cnt
        return array.joinToString("").count { it == '7' }
    }
}