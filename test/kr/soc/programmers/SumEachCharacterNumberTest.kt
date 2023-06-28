package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly

class SumEachCharacterNumberTest : BehaviorSpec({
    Given("test") {
        val sumEachCharacterNumber = SumEachCharacterNumber()
        When("123") {
            val solution = sumEachCharacterNumber.solution(123)
            Then("6") {
                solution shouldBeExactly 6
            }
        }
        When("987") {
            val solution = sumEachCharacterNumber.solution(987)
            Then("24") {
                solution shouldBeExactly 24
            }
        }
    }
})
