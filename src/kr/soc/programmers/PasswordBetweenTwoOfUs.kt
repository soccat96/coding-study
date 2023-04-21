package kr.soc.programmers

class PasswordBetweenTwoOfUs {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        val a = 'a'.code
        val z = 'z'.code
        val list = skip.toCharArray().map {
            it.code
        }

        for (c in s) {
            var i = 0
            var x = c.code

            while (i < index) {
                x += 1

                if (x > z) {
                    x -= (z - a + 1)
                }

                if (!list.contains(x)) {
                    i++
                }
            }

            answer += x.toChar()
        }

        return answer
    }
}