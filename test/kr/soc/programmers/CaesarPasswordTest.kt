package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.equals.shouldBeEqual

class CaesarPasswordTest : BehaviorSpec({
    Given("caesar password") {
        val caesarPassword = CaesarPassword()
//        "AB"	1	"BC"
//        "z"	1	"a"
//        "a B z"	4	"e F d"
        When("AB, 1") {
            val solution = caesarPassword.solution("AB", 1)
            Then("BC") {
                solution shouldBeEqual "BC"
            }
        }

        When("z, 1") {
            val solution = caesarPassword.solution("z", 1)
            Then("a") {
                solution shouldBeEqual "a"
            }
        }

        When("a B z, 4") {
            val solution = caesarPassword.solution("a B z", 4)
            Then("e F d") {
                solution shouldBeEqual "e F d"
            }
        }
    }


})
