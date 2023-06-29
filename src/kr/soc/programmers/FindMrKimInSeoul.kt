package kr.soc.programmers

class FindMrKimInSeoul {
    fun solution(seoul: Array<String>): String {
        for ((i, x) in seoul.withIndex()) {
            if (x.startsWith("Kim")) {
                return "김서방은 ${i}에 있다"
            }
        }

        return ""
    }
}