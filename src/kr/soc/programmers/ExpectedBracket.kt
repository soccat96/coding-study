package kr.soc.programmers

class ExpectedBracket {
    fun solution(n: Int, a: Int, b: Int): Int {
        var cnt = 0
        var aa = a
        var bb = b

        while (true) {
            aa = aa / 2 + aa % 2
            bb = bb / 2 + bb % 2

            cnt++
            if (aa == bb) return cnt
//            Integer.toBinaryString().length
        }
    }
}