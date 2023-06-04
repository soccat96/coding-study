package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class CoverPhoneNumberTest : BehaviorSpec({
//    "01033334444"	"*******4444"
//    "027778888"	"*****8888"
    Given("cover phone number") {
        val coverPhoneNumber = CoverPhoneNumber()

        When("01033334444") {
            val solution = coverPhoneNumber.solution("01033334444")
            Then("*******4444") {
                solution shouldBeEqual "*******4444"
            }
        }

        When("027778888") {
            val solution = coverPhoneNumber.solution("027778888")
            Then("*****8888") {
                solution shouldBeEqual "*****8888"
            }
        }
    }
})
