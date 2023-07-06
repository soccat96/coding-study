package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class GetCenterCharTest : BehaviorSpec({
    Given("get center char") {
        val getCenterChar = GetCenterChar()
//        "abcde"	"c"
//        "qwer"	"we"
        When("abcde") {
            val solution = getCenterChar.solution("abcde")
            Then("c") {
                solution shouldBeEqual "c"
            }
        }
        When("qwer") {
            val solution = getCenterChar.solution("qwer")
            Then("we") {
                solution shouldBeEqual "we"
            }
        }
    }
})
