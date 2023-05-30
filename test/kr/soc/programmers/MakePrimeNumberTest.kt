package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly

class MakePrimeNumberTest : BehaviorSpec({
//    [1,2,3,4]	1
//    [1,2,7,6,4]	4
//    val makePrimeNumber = MakePrimeNumber()
//    makePrimeNumber.solution(intArrayOf(1, 2, 3, 4)).shouldBeExactly(1)
//    makePrimeNumber.solution(intArrayOf(1, 2, 7, 6, 4)).shouldBeExactly(4)
    Given("makePrimeNumber") {
        val makePrimeNumber = MakePrimeNumber()

        When("[1,2,3,4]") {
            val solution = makePrimeNumber.solution(intArrayOf(1, 2, 3, 4))
            Then("1") {
                solution shouldBeExactly 1
            }
        }

        When("[1,2,7,6,4]") {
            val solution = makePrimeNumber.solution(intArrayOf(1, 2, 7, 6, 4))
            Then("4") {
                solution shouldBeExactly 4
            }
        }
    }
})
