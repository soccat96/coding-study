package kr.soc.programmers

class MakeWeirdString {
    fun solution(s: String): String {
        var answer = ""
        var count = 0

        for (x in s) {
            if (x == ' ') {
                count = 0
                answer += ' '
                continue
            }

            answer += if (count % 2 == 0) {
                x.uppercase()
            } else {
                x.lowercase()
            }
            count++
        }

        return answer
    }
}