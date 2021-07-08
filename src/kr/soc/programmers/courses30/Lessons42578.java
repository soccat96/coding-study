package kr.soc.programmers.courses30;

import java.util.*;

public class Lessons42578 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String[] cloth : clothes) {
            String name = cloth[0];
            String category = cloth[1];

            if (!hashMap.containsKey(category)) {
                hashMap.put(category, new ArrayList<>());
            }

            hashMap.get(category).add(name);
        }

        String[] keySetArray = hashMap.keySet().toArray(new String[]{});
        for (String s : keySetArray) {
            answer *= (hashMap.get(s).size() + 1);
        }

        return answer - 1;
    }
}
