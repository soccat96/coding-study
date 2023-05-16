package kr.soc.programmers

class AddPlusMinus {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer = 0

        absolutes.forEachIndexed { index, x ->
            if (signs[index]) {
                answer += x
            } else {
                answer -= x
            }
        }

        return answer
    }
}