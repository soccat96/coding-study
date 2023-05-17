package kr.soc.programmers

class SuggestNewId {
    fun solution(new_id: String): String {
        val step1 = new_id.lowercase()

        val step2 = step1.filter { it.isLowerCase() || it.isDigit() || it == '-' || it == '_' || it == '.' }

        var step3 = ""
        var flag = false
        for (ch in step2) {
            if (ch != '.') {
                step3 += ch

                if (flag) {
                    flag = false
                }
            } else {
                if (!flag) {
                    step3 += ch
                    flag = true
                }
            }
        }

        val step4 = step3.removePrefix(".").removeSuffix(".")

        val step5 = step4.ifEmpty { "a" }

        var step6 = if (step5.length >= 16) step5.substring(0, 15) else step5
        step6 = step6.removeSuffix(".")

        var step7 = step6
        while (step7.length <= 2) {
            step7 += step7.last()
        }

        return step7
    }
}