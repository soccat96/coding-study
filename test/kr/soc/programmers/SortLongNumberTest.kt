package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.longs.shouldBeExactly

class SortLongNumberTest : BehaviorSpec({
    Given("Sort Long Number") {
        val sortLongNumber = SortLongNumber()
        When("118372") {
            val solution = sortLongNumber.solution(118372)
            Then("873211") {
                solution shouldBeExactly 873211
            }
        }
    }
})
