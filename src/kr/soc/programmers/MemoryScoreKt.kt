package kr.soc.programmers

class MemoryScoreKt {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val answer: MutableList<Int> = mutableListOf<Int>()

        val map = mutableMapOf<String, Int>()
        name.mapIndexed { index, s -> map.put(s, yearning[index]) }
        for (x in photo) {
            var score = 0

            for (y in x) {
                if (map.containsKey(y)) {
                    score += map.getValue(y)
                }
            }

            answer.add(score)
        }

        return answer.toIntArray()
    }
}