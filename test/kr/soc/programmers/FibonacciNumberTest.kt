package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly

class FibonacciNumberTest : BehaviorSpec({
    Given("fibonacci number") {
        val fibonacciNumber = FibonacciNumber()
//        3	2
//        5	5
        When("3") {
            val solution = fibonacciNumber.solution(3)
            Then("2") {
                solution shouldBeExactly 2
            }
        }
        When("5") {
            val solution = fibonacciNumber.solution(5)
            Then("5") {
                solution shouldBeExactly 5
            }
        }
        When("2") {
            val solution = fibonacciNumber.solution(2)
            Then("2") {
                solution shouldBeExactly 1
            }
        }
    }
})
