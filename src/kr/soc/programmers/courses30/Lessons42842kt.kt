package kr.soc.programmers.courses30

class Lessons42842kt {
    fun solution(brown: Int, yellow: Int): IntArray {
        repeat(yellow) {
            val number = it + 1
            if (number <= (yellow / 2) + 1 && yellow % number == 0 && number <= yellow / number) {
                if ((number * 2) + ((yellow / number) * 2) + 4 == brown) {
                    return intArrayOf((yellow / number) + 2, number + 2)
                }
            }
        }

        return intArrayOf()
    }
}