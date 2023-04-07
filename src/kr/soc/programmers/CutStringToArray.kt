package kr.soc.programmers

class CutStringToArray {
    fun solution(my_str: String, n: Int): Array<String> {
        val list = mutableListOf<String>()

        var str = my_str
        while (str.length > n) {
            list.add(str.substring(0, n))
            str = str.substring(n, str.length)
        }
        list.add(str)

        return list.toTypedArray()
    }
}