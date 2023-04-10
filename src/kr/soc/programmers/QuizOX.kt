package kr.soc.programmers

class QuizOX {
    fun solution(quiz: Array<String>): Array<String> {
        val answer: MutableList<String> = mutableListOf<String>()

        for (str in quiz) {
            val split = str.split("=")
            val result = split[1].trim().toInt()
            val reg = split[0].split(" ")

            if (calcReg(parseReg(reg), result)) {
                answer.add("O")
            } else {
                answer.add("X")
            }
        }

        return answer.toTypedArray()
    }

    data class Element(val x: Int, val y: Int, val calcChar: Char)

    private fun parseReg(reg: List<String>): Element {
        return Element(reg[0].toInt(), reg[2].toInt(), reg[1][0])
    }

    private fun calcReg(element: Element, result: Int): Boolean {
        return if (element.calcChar == '+') {
            (element.x + element.y) == result
        } else {
            (element.x - element.y) == result
        }
    }
}