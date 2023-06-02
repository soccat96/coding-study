package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.equals.shouldBeEqual

class TermxCountnTest : BehaviorSpec({
//    2	5	[2,4,6,8,10]
//    4	3	[4,8,12]
//    -4	2	[-4, -8]
    Given("(start&increase, count) list") {
        val termxCountn = TermxCountn()

        When("2, 5") {
            val solution = termxCountn.solution(2, 5)
            Then("[2, 4, 6, 8, 10]") {
                solution contentEquals longArrayOf(2, 4, 6, 8, 10)
                solution.size shouldBeEqual 5
            }
            Then("toList") {
                solution.toList() shouldContainExactly longArrayOf(2, 4, 6, 8, 10).toList()
            }
        }

        When("4, 3") {
            val solution = termxCountn.solution(4, 3)
            Then("[4, 8, 12]") {
                solution contentEquals longArrayOf(4, 8, 12)
                solution.size shouldBeEqual 3
            }
            Then("toList") {
                solution.toList() shouldContainExactly longArrayOf(4, 8, 12).toList()
            }
        }

        When("-4, 2") {
            val solution = termxCountn.solution(-4, 2)
            Then("[-4, -8]") {
                solution contentEquals longArrayOf(-4, -8)
                solution.size shouldBeEqual 2
            }
            Then("toList") {
                solution.toList() shouldContainExactly longArrayOf(-4, -8).toList()
            }
        }
    }
})
