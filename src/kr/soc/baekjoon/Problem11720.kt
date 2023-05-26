package kr.soc.baekjoon

fun main() {
//    val scanner = Scanner(System.`in`)
//    val numCount = scanner.nextInt()
//    val numString = scanner.next()
    val numCount = readln().toInt()
    val numString = readln()

    var sum = 0
    for (x in 0 until numCount) {
        sum += numString[x].digitToInt()
    }

    println(sum)
}