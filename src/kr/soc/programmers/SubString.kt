package kr.soc.programmers

class SubString {
    fun solution(s: String): Int {
        var answer = 0
        var ss = s
        var sCnt = s.length
        var target = Char.MIN_VALUE
        var targetCnt = 0
        var compareCnt = 0

        while (true) {
            if (ss.isBlank()) break
            if (sCnt-- == 0) break

            val first = ss.first()
            ss = ss.substring(1, ss.length)

            when (target) {
                Char.MIN_VALUE -> {
                    target = first
                    targetCnt++
                }
                first -> {
                    targetCnt++
                }
                else -> {
                    compareCnt++
                }
            }

            if (targetCnt == compareCnt) {
                answer++
                target = Char.MIN_VALUE
                targetCnt = 0
                compareCnt = 0
            }
        }

        if (targetCnt != 0) {
            answer++
        }

        return answer
    }
}