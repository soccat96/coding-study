package kr.soc.programmers

class NumberStringAndEnglishWord {
    fun solution(s: String): Int {
        var str = s
        val numberWordMap = mutableMapOf<String, String>()
        numberWordMap["zero"]  = "0"
        numberWordMap["one"]   = "1"
        numberWordMap["two"]   = "2"
        numberWordMap["three"] = "3"
        numberWordMap["four"]  = "4"
        numberWordMap["five"]  = "5"
        numberWordMap["six"]   = "6"
        numberWordMap["seven"] = "7"
        numberWordMap["eight"] = "8"
        numberWordMap["nine"]  = "9"

        for (key in numberWordMap.keys) {
            str = str.replace(key, numberWordMap[key]!!)
        }

        return str.toInt()
    }
}