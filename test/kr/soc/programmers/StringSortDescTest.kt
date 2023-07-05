package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class StringSortDescTest : BehaviorSpec({
    Given("string sort desc") {
        val stringSortDesc = StringSortDesc()
        When("Zbcdefg") {
            val solution = stringSortDesc.solution("Zbcdefg")
            Then("gfedcbZ") {
                solution shouldBeEqual "gfedcbZ"
            }
        }
    }
})
