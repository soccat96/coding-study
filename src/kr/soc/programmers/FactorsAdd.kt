package kr.soc.programmers

class FactorsAdd {
    fun solution(left: Int, right: Int): Int {
        var answer = 0

        for (x in left..right) {
            val count = getCount(x)
            if (count % 2 == 0) {
                answer += x
            } else {
                answer -= x
            }
        }

        return answer
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