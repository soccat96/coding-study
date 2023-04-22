package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PersonalInformationTest {
    @Test
    fun test() {
//        "2022.05.19"	["A 6", "B 12", "C 3"]	["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]	[1, 3]
//        "2020.01.01"	["Z 3", "D 5"]	["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]	[1, 4, 5]
        val personalInformation = PersonalInformation()
        assertThat(personalInformation.solution(
            "2022.05.19",
            arrayOf("A 6", "B 12", "C 3"),
            arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")
        )).isEqualTo(intArrayOf(1, 3))
        assertThat(personalInformation.solution(
            "2020.01.01",
            arrayOf("Z 3", "D 5"),
            arrayOf("2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z")
        )).isEqualTo(intArrayOf(1, 4, 5))
    }
}