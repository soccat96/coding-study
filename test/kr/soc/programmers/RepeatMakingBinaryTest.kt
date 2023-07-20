package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec

class RepeatMakingBinaryTest : BehaviorSpec({
    Given("repeat making binary") {
        val repeatMakingBinary = RepeatMakingBinary()
//        "110010101001"	[3,8]
//        "01110"	[3,3]
//        "1111111"	[4,1]
        When("110010101001") {
            val solution = repeatMakingBinary.solution("110010101001")
            Then("[3, 8]") {
                solution contentEquals intArrayOf(3, 8)
            }
        }
        When("01110") {
            val solution = repeatMakingBinary.solution("01110")
            Then("[3, 3]") {
                solution contentEquals intArrayOf(3, 3)
            }
        }
        When("1111111") {
            val solution = repeatMakingBinary.solution("1111111")
            Then("[4, 1]") {
                solution contentEquals intArrayOf(4, 1)
            }
        }
    }

})
