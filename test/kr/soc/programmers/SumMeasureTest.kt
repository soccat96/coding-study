package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly

class SumMeasureTest : BehaviorSpec({
    Given("sum of measure") {
        val sumMeasure = SumMeasure()
        When("12") {
            val solution = sumMeasure.solution(12)
            Then("28") {
                solution shouldBeExactly 28
            }
        }
        When("5") {
            val solution = sumMeasure.solution(5)
            Then("6") {
                solution shouldBeExactly 6
            }
        }
    }
})
