package kr.soc.programmers

class RoughKeyboard {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
//        ["ABACD", "BCEFD"]	["ABCD","AABB"]	[9, 4]
//        ["AA"]	["B"]	[-1]
//        ["AGZ", "BSSS"]	["ASA","BGZ"]	[4, 6]
        val answer = mutableListOf<Int>()

        val keyboard = mutableMapOf<Char, Int>()
        for (str in keymap) {
            str.forEachIndexed { i, c ->
                if (keyboard.containsKey(c)) {
                    if (keyboard.getValue(c) > i) {
                        keyboard[c] = i+1
                    }
                } else {
                    keyboard[c] = i+1
                }
            }
        }

        for (str in targets) {
            var sum = 0

            for (c in str) {
                if (keyboard.containsKey(c)) {
                    sum += keyboard.getValue(c)
                } else {
                    sum = -1
                    break
                }
            }

            answer.add(sum)
        }

        return answer.toIntArray()
    }
}