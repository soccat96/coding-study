package kr.soc.programmers

import java.time.LocalDate

class Exam2016 {
    fun solution(a: Int, b: Int): String {
        return LocalDate.of(2016, a, b).dayOfWeek.name.substring(0, 3)
    }
}