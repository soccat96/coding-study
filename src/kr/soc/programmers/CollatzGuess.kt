package kr.soc.programmers

class CollatzGuess {
    fun solution(num: Int): Int {
        var count = 0
        var number = num.toLong()

        while (true) {
            if (count >= 500) return -1
            if (number == 1L) return count

            if (number % 2 == 0L) {
                number /= 2
            } else {
                number = (number * 3) + 1
            }
            count++
        }
    }
}