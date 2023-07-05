package kr.soc.programmers

class StringsSortCustom {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        strings.sortWith(compareBy({ it[n] }, { it }))
        return strings
    }
}