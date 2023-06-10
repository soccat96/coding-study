package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly

class GreatestFactorLeastMultipleTest : BehaviorSpec({
    Given("Greatest Common Factor And Least Common Multiple") {
        val greatestFactorLeastMultiple = GreatestFactorLeastMultiple()
//        3	12	[3, 12]
//        2	5	[1, 10]
        When("3, 12") {
            val solution = greatestFactorLeastMultiple.solution(3, 12)
            Then("[3, 12]") {
                solution[0] shouldBeExactly 3
                solution[1] shouldBeExactly 12
            }
        }
        When("2, 5") {
            val solution = greatestFactorLeastMultiple.solution(2, 5)
            Then("[1, 10]") {
                solution[0] shouldBeExactly 1
                solution[1] shouldBeExactly 10
            }
        }
    }
})
