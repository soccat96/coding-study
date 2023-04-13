package kr.soc.programmers

import kotlin.math.max
import kotlin.math.min

class WalkingPark {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val robotDog = RobotDog(park)
        for (route in routes) {
            robotDog.move(route)
        }

        return intArrayOf(robotDog.h, robotDog.w)
    }

    class RobotDog(park: Array<String>) {
        var w: Int = 0
        var h: Int = 0
        var park: Array<IntArray> = emptyArray()

        init {
            initPark(park)
        }

        fun move(str: String) {
            val split = str.split(" ")
            val op: Char = split[0][0]
            val n: Int = split[1].toInt()

            when (op) {
                'E' -> moveW(n)
                'W' -> moveW(n * -1)
                'N' -> moveH(n * -1)
                'S' -> moveH(n)
            }
        }
        private fun moveW(n: Int) {
            val v = this.w + n

            if (v < 0 || v > this.park[0].size-1) {
                return
            }

            val start = min(this.w, v)
            val end = max(this.w, v)
            for (x in start..end) {
                if (this.park[this.h][x] == -1) {
                    return
                }
            }

            this.w = v
        }
        private fun moveH(n: Int) {
            val v = this.h + n

            if (v < 0 || v > this.park.size-1) {
                return
            }

            val start = min(this.h, v)
            val end = max(this.h, v)
            for (y in start..end) {
                if (this.park[y][this.w] == -1) {
                    return
                }
            }

            this.h = v
        }
        fun initPark(park: Array<String>) {
            this.park = Array(park.size) { IntArray(park[0].length) }

            for ((h, str) in park.withIndex()) {
                for ((w, char) in str.withIndex()) {
                    when (park[h][w]) {
                        'S' -> {
                            this.h = h
                            this.w = w
                            this.park[h][w] = 0
                        }
                        'O' -> this.park[h][w] = 0
                        'X' -> this.park[h][w] = -1
                    }
                }
            }
        }
    }
}