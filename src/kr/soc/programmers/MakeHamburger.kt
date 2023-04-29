package kr.soc.programmers

import java.util.Stack

class MakeHamburger {
    fun solution(ingredient: IntArray): Int {
        var answer = 0
        val burger = "1231"

        val stack = Stack<Int>()
        for (x in ingredient) {
            stack.push(x)

            if (stack.size >= burger.length) {
                var str = ""
                repeat(burger.length) {
                    str += stack[stack.size - (it+1)]
                }

                if (burger == str.reversed()) {
                    answer++
                    repeat(burger.length) {
                        stack.pop()
                    }
                }
            }
        }

//        var str = ingredient.joinToString("")
//        while (str.lastIndexOf(burger) >= 0) {
//            str = str.replace(burger, "")
//            answer++
//        }

        return answer
    }
}