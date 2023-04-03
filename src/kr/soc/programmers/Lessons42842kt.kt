package kr.soc.programmers

class Lessons42842kt {
    fun solution(brown: Int, yellow: Int): IntArray {
//        return (1..yellow)
//                .filter { yellow % it == 0 }
//                .first { (it * 2) + ((yellow / it) * 2) + 4 == brown }
//                .let { intArrayOf((yellow / it) + 2, it + 2) }

//        val row = (1..yellow)
//                .filter {
//                    it <= (yellow / 2) + 1
//                            && yellow % it == 0
//                            && it <= yellow / it
//                            && (it * 2) + (yellow / it * 2) + 4 == brown
//                }[0]
//        return intArrayOf((yellow / row) + 2, row + 2)

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