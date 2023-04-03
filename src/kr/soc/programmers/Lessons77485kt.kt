package kr.soc.programmers

class Lessons77485kt {
    data class Point(
        val row: Int,
        val col: Int,
        var nextRow: Int,
        var nextCol: Int,
        var value: Int
    )

    fun solution(rows: Int, columns: Int, queries: Array<IntArray>) : IntArray {
        val answer = mutableListOf<Int>()

        val rc = mutableListOf<MutableList<Int>>()
        var cnt = 1
        for (i in 0 until rows) {
            val array = mutableListOf<Int>()
            for (j in 0 until columns) {
                array.add(cnt++)
            }
            rc.add(array)
        }

        queries.forEach{it1 ->
            val pointList = getPointList(it1)
            pointList.forEach { it2 ->
                it2.value = rc[it2.row][it2.col]
            }
            pointList.forEach { it2 ->
                rc[it2.nextRow][it2.nextCol] = it2.value
            }

            answer.add(pointList.minOf { it.value })
        }

        return answer.toIntArray()
    }

    private fun getPointList(query: IntArray): List<Point> {
        val pointList = mutableListOf<Point>()

        val indexes = getArrayIndexes(query)
        // line 1
        for (i in indexes[1] .. indexes[3]) {
            pointList.add(Point(
                    row = indexes[0],
                    col = i,
                    nextRow = 0,
                    nextCol = 0,
                    value = 0
            ))
        }
        // line 2
        for (i in indexes[0] + 1 .. indexes[2]) {
            pointList.add(Point(
                    row = i,
                    col = indexes[3],
                    nextRow = 0,
                    nextCol = 0,
                    value = 0
            ))
        }
        // line 3
        for (i in indexes[3] - 1 downTo indexes[1]) {
            pointList.add(Point(
                    row = indexes[2],
                    col = i,
                    nextRow = 0,
                    nextCol = 0,
                    value = 0
            ))
        }
        // line 4
        for (i in indexes[2] - 1 downTo indexes[0]) {
            pointList.add(Point(
                    row = i,
                    col = indexes[1],
                    nextRow = 0,
                    nextCol = 0,
                    value = 0
            ))
        }

        pointList.forEach {
            if (it.row == indexes[0]) {
                if (it.col == indexes[3]) {
                    it.nextRow = it.row + 1
                    it.nextCol = it.col
                }
                if (it.col != indexes[3]) {
                    it.nextRow = it.row
                    it.nextCol = it.col + 1
                }
            } else if (it.col == indexes[3]) {
                if (it.row == indexes[2]) {
                    it.nextRow = it.row
                    it.nextCol = it.col - 1
                }
                if (it.row != indexes[2]) {
                    it.nextRow = it.row + 1
                    it.nextCol = it.col
                }
            } else if (it.row == indexes[2]) {
                if (it.col == indexes[1]) {
                    it.nextRow = it.row - 1
                    it.nextCol = it.col
                }
                if (it.col != indexes[1]) {
                    it.nextRow = it.row
                    it.nextCol = it.col - 1
                }
            } else if (it.col == indexes[1]) {
                it.nextRow = it.row - 1
                it.nextCol = it.col
            }
        }

        return pointList
    }

    private fun getArrayIndexes(query: IntArray): List<Int> {
        return query.map {
            it - 1
        }
    }
}