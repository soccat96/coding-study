package kr.soc.programmers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WalkingParkTest {
    @Test
    fun test() {
//        ["SOO","OOO","OOO"]	["E 2","S 2","W 1"]	[2,1]
//        ["SOO","OXX","OOO"]	["E 2","S 2","W 1"]	[0,1]
//        ["OSO","OOO","OXO","OOO"]	["E 2","S 3","W 1"]	[0,0]
        val walkingPark = WalkingPark()
        assertThat(walkingPark.solution(arrayOf("SOO","OOO","OOO"), arrayOf("E 2","S 2","W 1")))
            .isEqualTo(intArrayOf(2, 1))
        assertThat(walkingPark.solution(arrayOf("SOO","OXX","OOO"), arrayOf("E 2","S 2","W 1")))
            .isEqualTo(intArrayOf(0, 1))
        assertThat(walkingPark.solution(arrayOf("OSO","OOO","OXO","OOO"), arrayOf("E 2","S 3","W 1")))
            .isEqualTo(intArrayOf(0, 0))
    }

    @Test
    fun makePark() {
        val robotDog = WalkingPark.RobotDog(arrayOf("SOO", "OOO", "OOO"))
        assertThat(robotDog.h).isEqualTo(0)
        assertThat(robotDog.w).isEqualTo(0)
        assertThat(robotDog.park).isEqualTo(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0)
            )
        )

        robotDog.initPark(arrayOf("SOO","OXX","OOO"))
        assertThat(robotDog.h).isEqualTo(0)
        assertThat(robotDog.w).isEqualTo(0)
        assertThat(robotDog.park).isEqualTo(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, -1, -1),
                intArrayOf(0, 0, 0)
            )
        )

        robotDog.initPark(arrayOf("OSO","OOO","OXO","OOO"))
        assertThat(robotDog.h).isEqualTo(0)
        assertThat(robotDog.w).isEqualTo(1)
        assertThat(robotDog.park).isEqualTo(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0),
                intArrayOf(0, -1, 0),
                intArrayOf(0, 0, 0)
            )
        )
    }

    @Test
    fun move() {
        val robotDog = WalkingPark.RobotDog(arrayOf("SOO","OXX","OOO"))
        robotDog.move("E 2")
        assertThat(robotDog.h).isEqualTo(0)
        assertThat(robotDog.w).isEqualTo(2)
        robotDog.move("S 2")
        assertThat(robotDog.h).isEqualTo(0)
        assertThat(robotDog.w).isEqualTo(2)
        robotDog.move("W 1")
        assertThat(robotDog.h).isEqualTo(0)
        assertThat(robotDog.w).isEqualTo(1)
    }
}