package kr.soc.programmers

class CalculateShortfall {
    fun solution(price: Int, money: Int, count: Int): Long {
        var sum = money * -1L
        for (c in 1..count) {
            sum += price * c
        }

        return if (sum < 0) 0 else sum
    }
}