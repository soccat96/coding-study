package kr.soc.programmers

import kotlin.math.abs

class PressKeypad {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""

        val numArray = arrayOf(
            Position(3, 1),
            Position(0, 0), Position(0, 1), Position(0, 2),
            Position(1, 0), Position(1, 1), Position(1, 2),
            Position(2, 0), Position(2, 1), Position(2, 2)
        )
        val leftFinger = Finger('L', Position(3, 0))
        val rightFinger = Finger('R', Position(3, 2))

        numbers.forEach {
            val p = numArray[it]
            val fromLeft = leftFinger.getDistance(p)
            val fromRight = rightFinger.getDistance(p)

            when (it) {
                1, 4, 7 -> {
                    answer += leftFinger.type
                    leftFinger.position = p
                }
                3, 6, 9 -> {
                    answer += rightFinger.type
                    rightFinger.position = p
                }
                2, 5, 8, 0 -> {
                    if (fromLeft > fromRight) {
                        answer += rightFinger.type
                        rightFinger.position = p
                    } else if (fromRight > fromLeft) {
                        answer += leftFinger.type
                        leftFinger.position = p
                    } else {
                        if (hand == "left") {
                            answer += leftFinger.type
                            leftFinger.position = p
                        } else {
                            answer += rightFinger.type
                            rightFinger.position = p
                        }
                    }
                }
            }
        }

        return answer
    }
    data class Position(val x: Int, val y: Int)
    class Finger(val type: Char, var position: Position) {
        fun getDistance(targetPosition: Position): Int {
            // 맨하탄 거리 - 상하좌우 1칸씩
            // 유클리드 거리, 해밍 거리
            return abs(targetPosition.x - position.x) + abs(targetPosition.y - position.y)
        }
    }
}