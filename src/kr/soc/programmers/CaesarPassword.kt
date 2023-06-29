package kr.soc.programmers

class CaesarPassword {
    fun solution(s: String, n: Int): String {
        var answer = ""

        for (ch in s) {
            val dti = ch.code
            answer += if (ch in 'a'..'z') {
                if (dti + n > 'z'.code) {
                    (dti + n - ('z'.code - 'a'.code + 1)).toChar()
                } else {
                    (dti + n).toChar()
                }
            } else if (ch in 'A'..'Z') {
                if (dti + n > 'Z'.code) {
                    (dti + n - ('Z'.code - 'A'.code + 1)).toChar()
                } else {
                    (dti + n).toChar()
                }
            } else {
                ch
            }
        }

        return answer
    }
}