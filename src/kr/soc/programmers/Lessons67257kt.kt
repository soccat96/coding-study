package kr.soc.programmers

import kotlin.math.abs

class Lessons67257kt {
    fun solution(expression: String): Long {
        val longNumberList = mutableListOf<Long>()

        longNumberList.add(getResult(expression, "*+-"))
        longNumberList.add(getResult(expression, "*-+"))
        longNumberList.add(getResult(expression, "+*-"))
        longNumberList.add(getResult(expression, "+-*"))
        longNumberList.add(getResult(expression, "-*+"))
        longNumberList.add(getResult(expression, "-+*"))

        return longNumberList.maxBy { it }!! // kotlin version problem
    }

    private fun getResult(expression: String, operatorRank: String): Long {
        val mapOfList = getListFromString(expression)

        operatorRank.forEach {
            calculateLists(mapOfList, it.toString())
        }

        return abs(mapOfList["operandList"]!![0].toLong())
    }

    private fun getListFromString(expression: String): MutableMap<String, MutableList<String>> {
        val returnMap = mutableMapOf<String, MutableList<String>>()
        val operandList = mutableListOf<String>()
        val operatorList = mutableListOf<String>()

        val split = expression.split("*", "+", "-")
        split.forEach {
            operandList.add(it)
        }
        expression.forEach {
            if (it == '*' || it == '+' || it == '-') {
                operatorList.add(it.toString())
            }
        }

        returnMap["operandList"] = operandList
        returnMap["operatorList"] = operatorList

        return returnMap
    }

    private fun calculateLists(map: Map<String, MutableList<String>>, operator: String) {
        val operandList = map["operandList"]!!
        val operatorList = map["operatorList"]!!

        while (operatorList.contains(operator)) {
            val i = operatorList.indexOf(operator)

            val result = getCalculatedNumber(operatorList[i], operandList[i], operandList[i + 1])
            operatorList.removeAt(i)
            operandList.removeAt(i)
            operandList.add(i, result.toString())
            operandList.removeAt(i + 1)
        }
    }

    private fun getCalculatedNumber(operator: String, operand01: String, operand02: String): Long {
        if(operator == "*") {
            return operand01.toLong() * operand02.toLong()
        }

        if(operator == "+") {
            return operand01.toLong() + operand02.toLong()
        }

        if(operator == "-") {
            return operand01.toLong() - operand02.toLong()
        }

        return 0
    }
}