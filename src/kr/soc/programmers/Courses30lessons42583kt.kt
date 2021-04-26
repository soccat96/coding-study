package kr.soc.programmers

class Courses30lessons42583kt {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var time: Int = 0

        data class Truck(val weight: Int, var positionOnBridge: Int)

        val waitList = mutableListOf<Truck>()
        truck_weights.forEach { waitList.add(Truck(weight = it, positionOnBridge = 0)) }

        val movingList = mutableListOf<Truck>()
        do {
            time++

            movingList.forEach { it.positionOnBridge++ }
            if(movingList.isNotEmpty() && movingList.first().positionOnBridge > bridge_length) {
                movingList.removeFirst()
            }

            if(waitList.isEmpty()) {
                continue
            }

            if(bridge_length <= movingList.size) {
                continue
            }

            val first = waitList.first()
            if(weight < movingList.sumBy { it.weight } + first.weight) {
                continue
            }

            first.positionOnBridge++
            movingList.add(first)
            waitList.removeFirst()

        } while (movingList.isNotEmpty())

        return time;
    }
}