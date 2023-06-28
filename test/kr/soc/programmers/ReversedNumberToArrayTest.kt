package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec

class ReversedNumberToArrayTest : BehaviorSpec({
    Given("given") {
        val reversedNumberToArray = ReversedNumberToArray()
        When("12345") {
            val solution = reversedNumberToArray.solution(12345)
            Then("[5, 4, 3, 2, 1]") {
                solution contentEquals intArrayOf(5, 4, 3, 2, 1)
            }
        }
    }
})
