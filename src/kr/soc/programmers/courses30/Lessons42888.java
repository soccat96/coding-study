package kr.soc.programmers.courses30;

import java.util.ArrayList;
import java.util.HashMap;

public class Lessons42888 {
    final static String ENTER  = "Enter";
    final static String LEAVE  = "Leave";
    final static String CHANGE = "Change";
    final static String ENTER_TO_KOR  = "님이 들어왔습니다.";
    final static String LEAVE_TO_KOR  = "님이 나갔습니다.";

    public String[] solution(String[] record) {
        HashMap<String, String> uidMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (String s : record) {
            String[] split = s.split(" ");
            if (split[0].equals(ENTER)) {
                uidMap.put(split[1], split[2]);
                list.add(split[1] + "/" + ENTER_TO_KOR);
            }
            if (split[0].equals(LEAVE)) {
                list.add(split[1] + "/" + LEAVE_TO_KOR);
            }
            if (split[0].equals(CHANGE)) {
                uidMap.put(split[1], split[2]);
            }
        }

        for (int i=0; i<list.size(); i++) {
            String[] split = list.get(i).split("/");
            list.set(i, uidMap.get(split[0]) + split[1]);
        }

        return list.toArray(new String[0]);
    }
}
