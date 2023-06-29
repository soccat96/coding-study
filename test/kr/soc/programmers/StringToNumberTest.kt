package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly

class StringToNumberTest : BehaviorSpec({
    Given("string to number") {
        val stringToNumber = StringToNumber()
        When("1234") {
            val solution = stringToNumber.solution("1234")
            Then("1234") {
                solution shouldBeExactly 1234
            }
        }
        When("-1234") {
            val solution = stringToNumber.solution("-1234")
            Then("-1234") {
                solution shouldBeExactly -1234
            }
        }
    }

})
