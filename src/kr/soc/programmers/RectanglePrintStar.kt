package kr.soc.programmers

class RectanglePrintStar {
    fun solution(str: String): String {
        val list = str.split(" ").map { it.toInt() }

        var string = ""
        for (y in 0 until list[1]) {
            for (x in 0 until list[0]) {
                string += "*"
            }

            if (y != list[1] - 1) string += System.lineSeparator()
        }

        return string
    }
}