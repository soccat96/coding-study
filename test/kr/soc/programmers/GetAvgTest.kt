package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class GetAvgTest : BehaviorSpec({
    Given("Get avg") {
        val getAvg = GetAvg()
        When("[1, 2, 3, 4]") {
            val solution = getAvg.solution(intArrayOf(1, 2, 3, 4))
            Then("2.5") {
                solution shouldBeEqual 2.5
            }
        }
        When("[5, 5]") {
            val solution = getAvg.solution(intArrayOf(5, 5))
            Then("5") {
                solution shouldBeEqual 5.0
            }
        }
    }
})
