package kr.soc.programmers.courses30

import kotlin.math.abs

class Lessons81302kt {
    data class Point(val row: Int, val col: Int, val value: Int)

    fun solution(places: Array<Array<String>>): IntArray {
        var answer = mutableListOf<Int>()

        places.forEach { it ->
            val list = mutableListOf<Point>()

            it.forEachIndexed { index1, string ->
                string.forEachIndexed { index2, c ->
                    list.add(when (c) {
                        'P' -> Point(index1, index2, 1)
                        'X' -> Point(index1, index2, -1)
                        'O' -> Point(index1, index2, 0)
                        else -> Point(index1, index2, 0)
                    })
                }
            }

            answer.add(isKeepTheRule(list.filter { it.value == 1 }, list))
        }

        return answer.toIntArray()
    }

    private fun getManhattanDistance(x: Point, y: Point): Int {
        return abs(x.row - y.row) + abs(x.col - y.col)
    }

    private fun isKeepTheRule(x: List<Point>, y: List<Point>): Int {
         x.forEach loop_x@{ x_it ->
            y.forEach loop_y@{ y_it ->
                if (x_it.row == y_it.row && x_it.col == y_it.col) { return@loop_y }
                if (y_it.value != 1) { return@loop_y }

                val manhattanDistance = getManhattanDistance(x_it, y_it)
                if (2 < manhattanDistance) { return@loop_y }
                if (1 == manhattanDistance) {
                    if (1 == y_it.value) {
                        return 0
                    }
                }

                if (x_it.row == y_it.row) {
                    if (x_it.col < y_it.col) {
                        val value = y.find { it.row == y_it.row && it.col == y_it.col - 1 }!!.value
                        if (1 <= y_it.value + value) {
                            return 0
                        }
                    }
                    if (y_it.col < x_it.col) {
                        val value = y.find { it.row == y_it.row && it.col == y_it.col + 1 }!!.value
                        if (1 <= y_it.value + value) {
                            return 0
                        }
                    }
                }
                if (x_it.col == y_it.col) {
                    if (x_it.row < y_it.row) {
                        val value = y.find { it.row == y_it.row - 1 && it.col == y_it.col }!!.value
                        if (1 <= y_it.value + value) {
                            return 0
                        }
                    }
                    if (y_it.row < x_it.row) {
                        val value = y.find { it.row == y_it.row + 1 && it.col == y_it.col }!!.value
                        if (1 <= y_it.value + value) {
                            return 0
                        }
                    }
                }
                if (x_it.row != y_it.row && x_it.col != y_it.col) {
                    // left up
                    if (x_it.row - 1 == y_it.row && x_it.col - 1 == y_it.col) {
                        val value1 = y.find { it.row == y_it.row + 1 && it.col == y_it.col }!!.value
                        val value2 = y.find { it.row == y_it.row && it.col == y_it.col + 1 }!!.value
                        if (1 <= y_it.value + value1 || 1 <= y_it.value + value2) {
                            return 0;
                        }
                    }
                    // left down
                    if (x_it.row + 1 == y_it.row && x_it.col - 1 == y_it.col) {
                        val value1 = y.find { it.row == y_it.row - 1 && it.col == y_it.col }!!.value
                        val value2 = y.find { it.row == y_it.row && it.col == y_it.col + 1 }!!.value
                        if (1 <= y_it.value + value1 || 1 <= y_it.value + value2) {
                            return 0;
                        }
                    }
                    // right up
                    if (x_it.row - 1 == y_it.row && x_it.col + 1 == y_it.col) {
                        val value1 = y.find { it.row == y_it.row && it.col == y_it.col - 1 }!!.value
                        val value2 = y.find { it.row == y_it.row + 1 && it.col == y_it.col}!!.value
                        if (1 <= y_it.value + value1 || 1 <= y_it.value + value2) {
                            return 0;
                        }
                    }
                    // right down
                    if (x_it.row + 1 == y_it.row && x_it.col + 1 == y_it.col) {
                        val value1 = y.find { it.row == y_it.row - 1 && it.col == y_it.col }!!.value
                        val value2 = y.find { it.row == y_it.row && it.col == y_it.col - 1 }!!.value
                        if (1 <= y_it.value + value1 || 1 <= y_it.value + value2) {
                            return 0;
                        }
                    }
                }
            }
        }

        return 1
    }
}