package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec

class RemoveSmallestTest : BehaviorSpec({
    Given("remove smallest number") {
        val removeSmallest = RemoveSmallest()
        When("[4, 3, 2, 1]") {
            val solution = removeSmallest.solution(intArrayOf(4, 3, 2, 1))
            Then("[4, 3, 2]") {
                solution contentEquals intArrayOf(4, 3, 2)
            }
        }
        When("[10]") {
            val solution = removeSmallest.solution(intArrayOf(10))
            Then("[-1]") {
                solution contentEquals intArrayOf(-1)
            }
        }
    }
})
