package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldContainExactly

class SumOfProcessionTest : BehaviorSpec({
    Given("sum of procession") {
        val sumOfProcession = SumOfProcession()
        When("[[1,2],[2,3]] [[3,4],[5,6]]") {
            val solution = sumOfProcession.solution(
                arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)),
                arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
            )
            Then("[[4,6],[7,9]]") {
                solution.toList() shouldContainExactly arrayOf(intArrayOf(4, 6), intArrayOf(7, 9)).toList()
            }
        }
        When(" [[1],[2]] [[3],[4]]") {
            val solution = sumOfProcession.solution(
                arrayOf(intArrayOf(1), intArrayOf(2)),
                arrayOf(intArrayOf(3), intArrayOf(4))
            )
            Then("[[4],[6]]") {
                solution.toList() shouldContainExactly arrayOf(intArrayOf(4), intArrayOf(6)).toList()
            }
        }
    }
})
