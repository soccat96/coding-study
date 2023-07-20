package kr.soc.programmers

class RepeatMakingBinary {
    fun solution(s: String): IntArray {
        var str = s
        var zeroCount = 0
        var repeatCount = 0

        while (str != "1") {
            repeatCount++
            zeroCount += str.count { it == '0' }
            val length = str.replace("0", "").length
            str = Integer.toBinaryString(length)
        }

        return intArrayOf(repeatCount, zeroCount)
    }
}