package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec

class DividedExactlyTest : BehaviorSpec({
    Given("divided exactly") {
        val dividedExactly = DividedExactly()
//        [5, 9, 7, 10]	5	[5, 10]
//        [2, 36, 1, 3]	1	[1, 2, 3, 36]
//        [3,2,6]	10	[-1]
        When("[5, 9, 7, 10], 5") {
            val solution = dividedExactly.solution(intArrayOf(5, 9, 7, 10), 5)
            Then("[5, 10]") {
                solution contentEquals intArrayOf(5, 10)
            }
        }
        When("[2, 36, 1, 3] 1") {
            val solution = dividedExactly.solution(intArrayOf(2, 36, 1, 3), 1)
            Then("[1, 2, 3, 36]") {
                solution contentEquals intArrayOf(1, 2, 3, 36)
            }
        }
        When("[3, 2, 6], 10") {
            val solution = dividedExactly.solution(intArrayOf(3, 2, 6), 10)
            Then("[-1]") {
                solution contentEquals intArrayOf(-1)
            }
        }
    }
})
