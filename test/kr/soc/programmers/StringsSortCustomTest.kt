package kr.soc.programmers

import io.kotest.core.spec.style.BehaviorSpec

class StringsSortCustomTest : BehaviorSpec({
    Given("strings sort custom") {
        val stringsSortCustom = StringsSortCustom()
//        ["sun", "bed", "car"]	1	["car", "bed", "sun"]
//        ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
        When("[sun, bed, car], 1") {
            val solution = stringsSortCustom.solution(arrayOf("sun", "bed", "car"), 1)
            Then("[\"car\", \"bed\", \"sun\"]") {
                solution contentDeepEquals arrayOf("car", "bed", "sun")
            }
        }
        When("[\"abce\", \"abcd\", \"cdx\"], 2") {
            val solution = stringsSortCustom.solution(arrayOf("abce", "abcd", "cdx"), 2)
            Then("[\"abcd\", \"abce\", \"cdx\"]") {
                solution contentDeepEquals arrayOf("abcd", "abce", "cdx")
            }
        }
    }
})
