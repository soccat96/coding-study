package kr.soc.programmers

class GetCenterChar {
    fun solution(s: String): String {
        val x = s.length / 2
        return if (s.length % 2 == 0) {
            s[x-1].toString() + s[x]
        } else {
            s[x].toString()
        }
    }
}