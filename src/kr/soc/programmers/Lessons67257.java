package kr.soc.programmers;

import java.util.*;

public class Lessons67257 {
    public long solution(String expression) {
        ArrayList<Long> numberList = new ArrayList<>();

        numberList.add(getResult(expression, "*+-"));
        numberList.add(getResult(expression, "*-+"));
        numberList.add(getResult(expression, "+*-"));
        numberList.add(getResult(expression, "+-*"));
        numberList.add(getResult(expression, "-*+"));
        numberList.add(getResult(expression, "-+*"));

        long max = Long.MIN_VALUE;
        for(Long x : numberList) {
            if(max < x) {
                max = x.longValue();
            }
        }

        return max;
    }

    public long getResult(final String expression, final String operatorRank) {
        Map<String, Object> map = getListsFromString(expression);

        for(int i=0; i<operatorRank.length(); i++) {
            calculateLists(map, String.valueOf(operatorRank.charAt(i)));
        }

        return Math.abs(Long.parseLong(((List<String>) map.get("operandList")).get(0)));
    }

    public Map<String, Object> getListsFromString(final String expression) {
        HashMap<String, Object> returnMap = new HashMap<>();
        ArrayList<String> operandList = new ArrayList<>();
        ArrayList<String> operatorList = new ArrayList<>();

        String[] split = expression.split("\\+|-|\\*");
        for(String x : split) {
            operandList.add(x);
        }
        for(int i=0; i<expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*') {
                operatorList.add(String.valueOf(c));
            }
        }

        returnMap.put("operandList", operandList);
        returnMap.put("operatorList", operatorList);

        return returnMap;
    }

    public void calculateLists(Map<String, Object> map, String operator) {
        List<String> operatorList = (List<String>) map.get("operatorList");
        List<String> operandList = (List<String>) map.get("operandList");

        while(operatorList.contains(operator)) {
            int i = operatorList.indexOf(operator);

            Long result = getCalculatedNumber(operatorList.get(i), operandList.get(i), operandList.get(i + 1));
            operatorList.remove(i);
            operandList.remove(i);
            operandList.add(i, String.valueOf(result));
            operandList.remove(i + 1);
        }
    }

    public Long getCalculatedNumber(String operator, String operand01, String operand02) {
        if(operator.equals("+")) {
            return Long.parseLong(operand01) + Long.parseLong(operand02);
        }

        if(operator.equals("-")) {
            return Long.parseLong(operand01) - Long.parseLong(operand02);
        }

        if(operator.equals("*")) {
            return Long.parseLong(operand01) * Long.parseLong(operand02);
        }

        return 0l;
    }
}
