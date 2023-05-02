package kr.soc.programmers

class ThreePerson {
    fun solution(number: IntArray): Int {
        var answer = 0

        number.sort()
        for (x in 0 until number.size) {
            for (y in x+1 until number.size) {
                for (z in y+1 until number.size) {
                    if (number[x] + number[y] + number[z] == 0) answer++
                }
            }
        }

        return answer
    }
}