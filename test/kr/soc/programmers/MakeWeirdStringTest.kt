package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class MakeWeirdStringTest : BehaviorSpec({
    Given("test") {
        val makeWeirdString = MakeWeirdString()
        When("try hello world") {
            val solution = makeWeirdString.solution("try hello world")
            Then("TrY HeLlO WoRlD") {
                solution shouldBeEqual "TrY HeLlO WoRlD"
            }
        }
    }
})
