package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class MinMaxAbsTest : BehaviorSpec({
//    "1 2 3 4"	"1 4"
//    "-1 -2 -3 -4"	"-4 -1"
//    "-1 -1"	"-1 -1"
    Given("min max abs") {
        val minMax = MinMax()
        When("1 2 3 4") {
            val solution = minMax.solution("1 2 3 4")
            Then("1 4") {
                solution shouldBeEqual "1 4"
            }
        }
        When("-1 -2 -3 -4") {
            val solution = minMax.solution("-1 -2 -3 -4")
            Then("-4 -1") {
                solution shouldBeEqual "-4 -1"
            }
        }
        When("-1 -1") {
            val solution = minMax.solution("-1 -1")
            Then("-1 -1") {
                solution shouldBeEqual "-1 -1"
            }
        }
    }
})
