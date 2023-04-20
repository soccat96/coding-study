package kr.soc.programmers

class DeckOfCards {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val yes = "Yes"
        val no = "No"
        val queue1 = ArrayDeque<String>()
        val queue2 = ArrayDeque<String>()
        queue1.addAll(cards1)
        queue2.addAll(cards2)

        for (str in goal) {
            if (queue1.isNotEmpty() && str == queue1.first()) {
                queue1.removeFirst()
                continue
            }
            if (queue2.isNotEmpty() && str == queue2.first()) {
                queue2.removeFirst()
                continue
            }

            return no
        }

        return yes
    }
}