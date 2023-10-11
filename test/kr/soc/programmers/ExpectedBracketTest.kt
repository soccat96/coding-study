package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly

class ExpectedBracketTest : BehaviorSpec({
    Given("expected bracket") {
        val expectedBracket = ExpectedBracket()
        When("8, 4, 7") {
            val solution = expectedBracket.solution(8, 4, 7)
            Then("3") {
                solution shouldBeExactly 3
            }
        }
    }
})
