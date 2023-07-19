package kr.soc.programmers

class MakeJadenCaseString {
    fun solution(s: String): String {
        val split = s.split(" ")
        val list = mutableListOf<String>()

        for (x in split) {
            var str = ""

            for ((i, y) in x.withIndex()) {
                str += if (i == 0) {
                    y.uppercase()
                } else {
                    y.lowercase()
                }
            }

            list.add(str)
        }

        return list.joinToString(" ")
    }
}