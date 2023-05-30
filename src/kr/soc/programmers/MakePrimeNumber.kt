package kr.soc.programmers

class MakePrimeNumber {
    fun solution(nums: IntArray): Int {
        var answer = 0

        nums.sort()
        val size = nums.size
        val list = mutableListOf<Int>()
        for (a in 0 until size) {
            val x = nums[a]

            for (b in a+1 until size) {
                val y = nums[b]
                if (x == y) continue

                for (c in b+1 until size) {
                    val z = nums[c]
                    if (x == z || y == z) continue

                    list.add(x + y + z)
                }
            }
        }

        for (x in list) {
            if (isPrimeNumber(x)) answer++
        }

        return answer
    }

    private fun isPrimeNumber(x: Int): Boolean {
        if (x == 0 || x == 1) {
            return false
        }

        var y = 2
        while (y < x) {
            if (x % y == 0) {
                return false
            }

            y++
        }

        return true
    }
}