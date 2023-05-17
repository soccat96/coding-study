package kr.soc.programmers

class SuggestNewId {
    fun solution(new_id: String): String {
        val step1 = new_id.lowercase()

        var step2 = "" // think filter
        for (ch in step1) {
            if (!(ch.isLowerCase() || ch.isDigit() || ch == '-' || ch == '_' || ch == '.')) {
                step2 += ""
            } else {
                step2 += ch
            }
        }

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

        step3 = step3.removePrefix(".")
        step3 = step3.removeSuffix(".")
        val step4 = step3

        val step5 = if (step4.isEmpty()) "a" else step4

        var step6 = if (step5.length >= 16) step5.substring(0, 15) else step5
        step6 = step6.removeSuffix(".")

        var step7 = step6
        while (step7.length <= 2) {
            step7 += step7.last()
        }

        return step7
    }
}