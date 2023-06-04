package kr.soc.programmers

class CoverPhoneNumber {
    fun solution(phone_number: String): String {
        var answer = ""

        val size = phone_number.length - 4
        repeat(size) {
            answer += "*"
        }
        answer += phone_number.substring(size, phone_number.length)

        return answer
    }
}