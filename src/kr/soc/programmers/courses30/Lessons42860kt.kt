package kr.soc.programmers.courses30

import kotlin.math.abs

class Lessons42860kt {
    private val aNumericValue = 10
    private val zNumericValue = 35

    fun solution(name: String): Int {
        var result = ""
        repeat(name.length) {
            result += 'A'
        }

        var move = -1
        var change = 0
        var index = 0

        do {
            move++

            if (name[index] != result[index]) {
                change += getLessThan(name[index])
                result = result.substring(0, index) + name[index] + result.substring(index + 1)
            }

            index += getIndexParam(name, result, index)
            if (index < 0) {
                index = name.length - 1
            }
        } while (result != name)

        return change + move
    }

    private fun getLessThan(char: Char): Int {
        val value = Character.getNumericValue(char)
        val aAbs = abs(aNumericValue - value)
        val zAbs = abs(zNumericValue - value) + 1

        if(aAbs < zAbs) {
            return aAbs
        }

        return zAbs
    }

    private fun getIndexParam(name: String, result: String, index: Int): Int {
        var min = name.length
        var max = 0
        var hasFound = false

        for (i in name.indices) {
            if (name[i] != 'A' && name[i] != result[i] && !hasFound) {
                min = i
                hasFound = true
            }

            if (name[i] != 'A' && name[i] != result[i]) {
                max = i
            }
        }

        if (index > max) {
            if (name.length - index + min <= index - max) {
                return 1
            }

            return -1
        }

        if (min - index <= name.length - max + index) {
            return 1
        }

        return -1
    }
}