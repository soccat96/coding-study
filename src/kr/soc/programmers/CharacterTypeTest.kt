package kr.soc.programmers

class CharacterTypeTest {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val list = listOf("RT", "CF", "JM", "AN")
        val map = mutableMapOf<String, Int>()

        for ((i, x) in survey.withIndex()) {
            var key: String
            var num = choices[i] - 4
            if (list.indexOf(x) >= 0) {
                key = x
                num *= -1
            } else {
                key = x.reversed()
                num *= 1
            }

            if (map.containsKey(key)) {
                map[key] = map[key]!! + num
            } else {
                map[key] = num
            }
        }

        var answer = ""
        for (x in list) {
            answer += if (map.containsKey(x)) {
                val num = map[x]!!
                if (num < 0) {
                    x[1]
                } else {
                    x[0]
                }
            } else {
                x[0]
            }
        }

        return answer
    }
}