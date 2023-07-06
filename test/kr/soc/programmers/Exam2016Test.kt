package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class Exam2016Test : BehaviorSpec({
    Given("2016") {
        val exam2016 = Exam2016()
        When("5, 24") {
            val solution = exam2016.solution(5, 24)
            Then("TUE") {
                solution shouldBeEqual "TUE"
            }
        }
    }
})
