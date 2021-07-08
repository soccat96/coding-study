package kr.soc.programmers.courses30;

import java.util.*;

public class Lessons72411 {
    public String[] solution(String[] orders, int[] course) {
        HashMap<Character, Integer> menuMap = new HashMap<>();
        for (int i=0; i<orders.length; i++) {
            for (int j=0; j<orders[i].length(); j++) {
                char c = orders[i].charAt(j);
                if (menuMap.containsKey(c)) {
                    menuMap.put(c, menuMap.get(c) + 1);
                } else {
                    menuMap.put(c, 1);
                }
            }
        }

        StringBuilder menuStringBuilder = new StringBuilder();
        Set<Character> menuSet = menuMap.keySet();
        for (Character x : menuSet) {
            if (menuMap.get(x) > 1) {
                menuStringBuilder.append(x);
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        recursive(menuStringBuilder.toString(), "", -1, course, map);

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            char[] chars = key.toCharArray();

            for (int i=0; i<orders.length; i++) {
                boolean[] charFlagArray = new boolean[chars.length];
                for (int j=0; j<chars.length; j++) {
                    if (orders[i].indexOf(chars[j]) >= 0) {
                        charFlagArray[j] = true;
                    }
                }

                boolean totalCharFlag = true;
                for (int j=0; j< charFlagArray.length; j++) {
                    totalCharFlag = totalCharFlag && charFlagArray[j];
                }

                if (totalCharFlag) {
                    map.put(key, map.get(key).intValue() + 1);
                }
            }
        }

        ArrayList<String> returnList = new ArrayList<>();
        for (int i=0; i<course.length; i++) {
            int orderedCount = 2;
            for (String key : keySet) {
                if (key.length() == course[i] && map.get(key) >= orderedCount) {
                    orderedCount = map.get(key);
                }
            }
            for (String key : keySet) {
                if (key.length() == course[i] && map.get(key) == orderedCount) {
                    returnList.add(key);
                }
            }
        }

        Collections.sort(returnList);
        return returnList.toArray(new String[]{});
    }

    private void recursive(String string, String result, int index, int[] courses, Map<String, Integer> map) {
        for(int i = index + 1; i < string.length(); i++) {
            String s = result + string.charAt(i);

            boolean lengthCheck = false;
            for (int j=0; j<courses.length; j++) {
                if (s.length() == courses[j]) {
                    lengthCheck = true;
                    break;
                }
            }

            if (lengthCheck && !map.containsKey(s)) {
                map.put(s, 0);
            }

            if (s.length() < courses[courses.length - 1]) {
                recursive(string, s, i, courses, map);
            }
        }
    }
}
