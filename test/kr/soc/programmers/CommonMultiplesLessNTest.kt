package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly

class CommonMultiplesLessNTest : BehaviorSpec({
    Given("common multiples less test") {
        val commonMultiplesLessN = CommonMultiplesLessN()
        When("[2, 6, 8, 14]") {
            val solution = commonMultiplesLessN.solution(intArrayOf(2, 6, 8, 14))
            Then("168") {
                solution shouldBeExactly 168
            }
        }
        When("[1, 2, 3]") {
            val solution = commonMultiplesLessN.solution(intArrayOf(1, 2, 3))
            Then("6") {
                solution shouldBeExactly 6
            }
        }
    }
})
