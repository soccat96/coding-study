package kr.soc.programmers

class Babbling2 {
    fun solution(babbling: Array<String>): Int {
        var answer = 0

        val canSpeak = arrayOf("aya", "ye", "woo", "ma")
        val cannotSpeak = mutableListOf<String>()
        for (x in canSpeak) {
            cannotSpeak.add(x + x)
        }

        for (x in babbling) {
            var flag = false
            for (y in cannotSpeak) {
                if (x.contains(y)) flag = true
            }

            if (flag) continue

            var s = x
                .replace(canSpeak[0], "0")
                .replace(canSpeak[1], "0")
                .replace(canSpeak[2], "0")
                .replace(canSpeak[3], "0")
            s = s.replace("0", "")
            if (s.isBlank()) answer++
        }

        return answer
    }
}