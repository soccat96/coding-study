package kr.soc.programmers

class PersonalInformation {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()

        val todayMd = MyDate(today)
        val termsMap = mutableMapOf<Char, Int>()
        for (it in terms) {
            val split = it.split(" ")
            termsMap[split[0][0]] = split[1].toInt()
        }
        val privacyDateList = mutableListOf<PrivacyDate>()
        for (it in privacies) {
            val split = it.split(" ")
            privacyDateList.add(PrivacyDate(split[0], split[1][0]))
        }
        for ((i, pd) in privacyDateList.withIndex()) {
            pd.set(termsMap[pd.term]!!)
            if (!pd.isAfter(todayMd)) {
                answer.add(i+1)
            }
        }

        return answer.toIntArray()
    }

    open class MyDate(yyyymmdd: String) {
        var year: Int
        var month: Int
        var date: Int

        init {
            val split = yyyymmdd.split(".")
            this.year = split[0].toInt()
            this.month = split[1].toInt()
            this.date = split[2].toInt()
        }

    }
    class PrivacyDate(yyyymmdd: String, val term: Char): MyDate(yyyymmdd) {
        fun set(m: Int) {
            this.month += m

            while (this.month > 12) {
                this.month -= 12
                this.year++
            }
        }

        fun isAfter(today: MyDate):Boolean {
            if (this.year > today.year) {
                return true
            }
            if (this.year == today.year && this.month > today.month) {
                return true
            }
            return this.year == today.year && this.month == today.month && this.date > today.date
        }
    }
}