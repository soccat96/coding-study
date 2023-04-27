package kr.soc.programmers

class WeaponOfKnight {
    fun solution(number: Int, limit: Int, power: Int): Int {
        val list = mutableListOf<Int>()
        for (x in 1..number) {
            val count = getCount(x)

            if (count > limit) {
                list.add(power)
            } else {
                list.add(count)
            }
        }

        return list.sum()
    }

    private fun getCount(num: Int): Int {
        // 약수의 개수를 구하는 방법
        var count = 0

        var x = 1
        while (x * x <= num) {
            if (x * x == num) count++
            else if (num % x == 0) count += 2

            x++
        }

        return count
    }
}