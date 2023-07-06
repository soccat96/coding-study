package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.longs.shouldBeExactly

class SumBetweenIntAndIntTest : BehaviorSpec({
    Given("sum between Int and Int") {
        val sumBetweenIntAndInt = SumBetweenIntAndInt()
//        3	5	12
//        3	3	3
//        5	3	12
        When("3, 5") {
            val solution = sumBetweenIntAndInt.solution(3, 5)
            Then("12") {
                solution shouldBeExactly 12
            }
        }
        When("3, 3") {
            val solution = sumBetweenIntAndInt.solution(3, 3)
            Then("3") {
                solution shouldBeExactly 3
            }
        }
        When("5, 3") {
            val solution = sumBetweenIntAndInt.solution(5, 3)
            Then("12") {
                solution shouldBeExactly 12
            }
        }
    }
})
