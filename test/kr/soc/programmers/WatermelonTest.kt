package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class WatermelonTest : BehaviorSpec({
    Given("수박수박수박수박수박수?") {
        val watermelon = Watermelon()
        When("3") {
            val solution = watermelon.solution(3)
            Then("수박수") {
                solution shouldBeEqual "수박수"
            }
        }
        When("4") {
            val solution = watermelon.solution(4)
            Then("수박수박") {
                solution shouldBeEqual "수박수박"
            }
        }
    }
})
