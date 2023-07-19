package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class MakeJadenCaseStringTest : BehaviorSpec({
    Given("make jaden case string") {
        val makeJadenCaseString = MakeJadenCaseString()
//        "3people unFollowed me"	"3people Unfollowed Me"
//        "for the last week"	"For The Last Week"
        When("3people unFollowed me") {
            val solution = makeJadenCaseString.solution("3people unFollowed me")
            Then("3people Unfollowed Me") {
                solution shouldBeEqual "3people Unfollowed Me"
            }
        }
        When("for the last week") {
            val solution = makeJadenCaseString.solution("for the last week")
            Then("For The Last Week") {
                solution shouldBeEqual "For The Last Week"
            }
        }
    }
})
