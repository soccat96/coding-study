package kr.soc.programmers

class StringControl {
    fun solution(s: String): Boolean {
        if (!(s.length == 4 || s.length == 6)) return false
        for (x in s) {
            if (x in 'a'..'z' || x in 'A'..'Z') return false
        }

        return true
    }
}