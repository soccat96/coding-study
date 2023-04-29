package kr.soc.programmers

class FoodFight {
    fun solution(food: IntArray): String {
        var str = ""

        for ((i, x) in food.withIndex()) {
            val count = x / 2
            repeat(count) {
                str += i
            }
        }

        return str + "0" + str.reversed()
    }
}