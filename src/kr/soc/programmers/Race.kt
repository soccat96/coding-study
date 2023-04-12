package kr.soc.programmers

class Race {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val map = mutableMapOf<String, Int>()
        for ((index, player) in players.withIndex()) {
            map[player] = index
        }

        for (call in callings) {
            val i = map[call]!!
            val s = players[i - 1]

            players[i] = s
            players[i - 1] = call

            map[call] = i - 1
            map[s] = i
        }

        return players
    }
}