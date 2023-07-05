package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class StringControlTest : BehaviorSpec({
    Given("string control") {
        val stringControl = StringControl()
        When("a234") {
            val solution = stringControl.solution("a234")
            Then("false") {
                solution shouldBeEqual false
            }
        }
        When("1234") {
            val solution = stringControl.solution("1234")
            Then("true") {
                solution shouldBeEqual true
            }
        }
    }
})
