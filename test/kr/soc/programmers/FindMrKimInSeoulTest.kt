package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class FindMrKimInSeoulTest : BehaviorSpec({
    Given("find Mr.KIM in Seoul") {
        val findMrKimInSeoul = FindMrKimInSeoul()
        When("[Jane, Kim]") {
            val solution = findMrKimInSeoul.solution(arrayOf("Jane", "Kim"))
            Then("김서방은 1에 있다") {
                solution shouldBeEqual "김서방은 1에 있다"
            }
        }
    }
})
