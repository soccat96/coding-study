package kr.soc.programmers;

import java.util.*;

public class Lessons64065 {
    public int[] solution(String s) {
        ArrayList<Integer> answerList = new ArrayList<>();

        List<String[]> stringList = getStringList(
                s.replace("{{", "").replace("}}", "")
        );
        Collections.sort(stringList, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1.length < o2.length) {
                    return -1;
                } else if (o1.length == o2.length) {
                    return 0;
                } else { // split1.length > split2.length
                    return 1;
                }
            }
        });

        for (String[] x : stringList) {
            for (String y : x) {
                int v = Integer.parseInt(y);
                if (!answerList.contains(v)) {
                    answerList.add(v);
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public List<String[]> getStringList(String s) {
        ArrayList<String[]> returnList = new ArrayList<>();
        String[] split = s.split("},\\{");
        for (String x : split) {
            returnList.add(x.split(","));
        }

        return returnList;
    }
}
