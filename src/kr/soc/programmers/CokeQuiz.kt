package kr.soc.programmers

class CokeQuiz {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer = 0

        var cokeBottle = n
        while (cokeBottle >= a) {
            val get = (cokeBottle / a) * b
            cokeBottle %= a
            cokeBottle += get
            answer += get
        }

        return answer
    }
}