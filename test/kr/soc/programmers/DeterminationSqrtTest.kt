package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.longs.shouldBeExactly

class DeterminationSqrtTest : BehaviorSpec({
    Given("determination sqrt") {
        val determinationSqrt = DeterminationSqrt()

//        121	144
//        3	-1
        When("121") {
            val solution = determinationSqrt.solution(121)
            Then("144") {
                solution shouldBeExactly 144
            }
        }
        When("3") {
            val solution = determinationSqrt.solution(3)
            Then("-1") {
                solution shouldBeExactly -1
            }
        }
        When("0") {
            val solution = determinationSqrt.solution(0)
            Then("-1") {
                solution shouldBeExactly -1
            }
        }
        When("1") {
            val solution = determinationSqrt.solution(1)
            Then("4") {
                solution shouldBeExactly 4
            }
        }
    }
})
