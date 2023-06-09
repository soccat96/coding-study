package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly

class CollatzGuessTest : BehaviorSpec({
    Given("Collatz Guess") {
        val collatzGuess = CollatzGuess()
        When("6") {
            val solution = collatzGuess.solution(6)
            Then("8") {
                solution shouldBeExactly 8
            }
        }
        When("16") {
            val solution = collatzGuess.solution(16)
            Then("4") {
                solution shouldBeExactly 4
            }
        }
        When("626331") {
            val solution = collatzGuess.solution(626331)
            Then("-1") {
                solution shouldBeExactly -1
            }
        }
    }
})
