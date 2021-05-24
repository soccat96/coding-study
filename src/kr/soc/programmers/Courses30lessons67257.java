package kr.soc.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Courses30lessons67257 {
    public long solution(String expression) {
        ArrayList<Long> list = new ArrayList<>();

        // * + -
        list.add(Math.abs(Long.parseLong(
                recursiveMinus(recursivePlus(recursiveMulti(expression)))
        )));
        // * - +
        list.add(Math.abs(Long.parseLong(
                recursiveMinus(recursivePlus(recursiveMulti(expression)))
        )));
        // + * -
        list.add(Math.abs(Long.parseLong(
                recursiveMinus(recursiveMulti(recursivePlus(expression)))
        )));
        // + - *
        list.add(Math.abs(Long.parseLong(
                recursiveMulti(recursiveMinus(recursivePlus(expression)))
        )));
        // - * +
        list.add(Math.abs(Long.parseLong(
                recursivePlus(recursiveMulti(recursiveMinus(expression)))
        )));
        // - + *
        list.add(Math.abs(Long.parseLong(
                recursiveMulti(recursivePlus(recursiveMinus(expression)))
        )));

        long max = Long.MIN_VALUE;
        for(Long x : list) {
            if(max < x) {
                max = x.longValue();
            }
        }

        return max;
    }

    public Map<String, Object> getFrontNumber(String expression, int index) {
        HashMap<String, Object> returnMap = new HashMap<>();
        returnMap.put("index", 0);
        returnMap.put("number", 0l);

        String result = "";
        String frontString = expression.substring(0, index);

        for(int i=frontString.length()-1; i>=0; i--) {
            char charAt = frontString.charAt(i);
            if(charAt < '0' || '9' < charAt) {
                returnMap.put("index", index - i);
                break;
            }

            result = charAt + result;
        }
        returnMap.put("number", (long) returnMap.get("number") + Long.parseLong(result));


        return returnMap;
    }

    public Map<String, Object> getBackNumber(String expression, int index) {
        HashMap<String, Object> returnMap = new HashMap<>();
        returnMap.put("index", expression.length() - 1);
        returnMap.put("number", 0l);

        String result = "";
        String backString = expression.substring(index + 1);

        for(int i=0; i<backString.length(); i++) {
            char charAt = backString.charAt(i);
            if(charAt < '0' || '9' < charAt) {
                returnMap.put("index", index + i);
                break;
            }

            result = result + charAt;
        }
        returnMap.put("number", (long) returnMap.get("number") + Long.parseLong(result));

        return returnMap;
    }

    public String recursiveMulti(String expression) {
        int indexOf = expression.indexOf("*");

        if(indexOf == -1) {
            return expression;
        }

        Map<String, Object> f = getFrontNumber(expression, indexOf);
        Map<String, Object> b = getBackNumber(expression, indexOf);
        long number = (long) f.get("number") * (long) b.get("number");

        return recursiveMulti(
                expression.substring(0, (int) f.get("index")) + number + expression.substring((int) b.get("index") + 1)
        );
    }

    public String recursivePlus(String expression) {
        int indexOf = expression.indexOf("+");

        if(indexOf == -1) {
            return expression;
        }

        Map<String, Object> f = getFrontNumber(expression, indexOf);
        Map<String, Object> b = getBackNumber(expression, indexOf);
        long number = (long) f.get("number") + (long) b.get("number");

        return recursivePlus(
                expression.substring(0, (int) f.get("index")) + number + expression.substring((int) b.get("index") + 1)
        );
    }

    public String recursiveMinus(String expression) {
        int indexOf = expression.indexOf("-", 1);

        if(indexOf == -1) {
            return expression;
        }

        Map<String, Object> f = getFrontNumber(expression, indexOf);
        Map<String, Object> b = getBackNumber(expression, indexOf);
        long number = (long) f.get("number") - (long) b.get("number");

        return recursiveMinus(
                expression.substring(0, (int) f.get("index")) + number + expression.substring((int) b.get("index") + 1)
        );
    }
}
