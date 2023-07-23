package kr.soc.programmers

class FibonacciNumber {
//    fun solution(n: Int): Int {
//        return getFibonacci(n) % 1234567
//    }
//
//    private fun getFibonacci(n: Int): Int {
//        return when (n) {
//            0 -> 0
//            1 -> 1
//            else -> getFibonacci(n - 1) + getFibonacci(n - 2)
//        }
//    }

    /**
     * 동적 프로그래밍 Dynamic programing
     *   작은 문제들의 반복 모임 = 큰 문제, 재귀? 1/f?
     *   top down - memoization 재귀?, bottom up - tabulation 반복문?
     * 모듈러 연산 modulo
     *   (A + B) % C ≡ ( ( A % C ) + ( B % C) ) % C
     */
    fun solution(n: Int): Int {
        val x = 1234567
        val list = mutableListOf<Int>()
        list.add(0)
        list.add(1)
        var count = 2

        while (count <= n) {
            list.add(list[count - 1] % x + list[count - 2] % x)
            count++
        }

        return list[n] % x
    }
}