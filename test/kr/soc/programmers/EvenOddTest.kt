package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class EvenOddTest : BehaviorSpec({
    Given("Even Odd") {
        val evenOdd = EvenOdd()
        When("3") {
            val solution = evenOdd.solution(3)
            Then("Odd") {
                solution shouldBeEqual "Odd"
            }
        }
        When("4") {
            val solution = evenOdd.solution(4)
            Then("Even") {
                solution shouldBeEqual "Even"
            }
        }
    }
})
