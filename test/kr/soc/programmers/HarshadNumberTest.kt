package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class HarshadNumberTest : BehaviorSpec({
    Given("harshad number") {
        val harshadNumber = HarshadNumber()

        When("10") {
            val solution = harshadNumber.solution(10)
            Then("true") {
                solution shouldBeEqual true
            }
        }
        When("12") {
            val solution = harshadNumber.solution(12)
            Then("true") {
                solution shouldBeEqual true
            }
        }
        When("11") {
            val solution = harshadNumber.solution(11)
            Then("false") {
                solution shouldBeEqual false
            }
        }
        When("13") {
            val solution = harshadNumber.solution(13)
            Then("false") {
                solution shouldBeEqual false
            }
        }
    }
})
