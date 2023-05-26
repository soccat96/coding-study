package kr.soc.baekjoon

fun main(args: Array<String>) {
    println(Problem11720.solution(args))
}

class Problem11720 {
    companion object {
        fun solution(args: Array<String>): Int {
            val numCount: Int
            val numString: String

            if (args.isEmpty()) {
                numCount = readln().toInt()
                numString = readln()
            } else {
                numCount = args[0].toInt()
                numString = args[1]
            }

            var sum = 0
            for (x in 0 until numCount) {
                sum += numString[x].digitToInt()
            }

            return sum
        }
    }
}