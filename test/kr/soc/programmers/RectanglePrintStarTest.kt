package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class RectanglePrintStarTest : BehaviorSpec({
    Given("print rectangle of stars") {
    val rectanglePrintStar = RectanglePrintStar()
        When("5 3") {
            val solution = rectanglePrintStar.solution("5 3")
            Then("5 * 3 rectangle") {
                solution shouldBeEqual """
                    *****
                    *****
                    *****
                """.trimIndent()
            }
        }
    }
})
