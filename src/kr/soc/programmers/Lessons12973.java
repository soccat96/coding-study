package kr.soc.programmers;

import java.util.*;

public class Lessons12973 {
    public int solution(String s) {
//        String str = s;
//        int idx = 0;
//        boolean flag = true;
//
//        do {
//            if (s.length() <= 1 || str.length() <= 1
//                    || idx == str.length() - 1 || idx < 0) {
//                flag = false;
//                continue;
//            }
//
//            char c0 = str.charAt(idx);
//            char c1 = str.charAt(idx + 1);
//            if (c0 == c1) {
//                String strBefore = str.substring(0, idx);
//                String strAfter = str.substring(idx + 2);
//                str = strBefore + strAfter;
//
//                if (idx != 0) {
//                    idx--;
//                }
//            } else {
//                idx++;
//            }
//        } while (flag);

        if (s.length() == 0) {
            return 1;
        }
        if (s.length() == 1) {
            return 0;
        }

        List<Character> list = new ArrayList<>(s.length());
        char[] chars = s.toCharArray();
        for (int i=0; i<chars.length; i++) {
            if (list.isEmpty()) {
                list.add(chars[i]);
                continue;
            }

            int sizeMinusOne = list.size() - 1;
            if (list.get(sizeMinusOne).charValue() == chars[i]) {
                list.remove(sizeMinusOne);
            } else {
                list.add(chars[i]);
            }
        }

        return list.size() == 0 ? 1 : 0;
    }
}
