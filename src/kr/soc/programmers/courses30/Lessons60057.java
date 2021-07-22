package kr.soc.programmers.courses30;

import java.util.*;

public class Lessons60057 {
    int solution(String s) {
        List<String> compression = compression(s);
        int min = Integer.MAX_VALUE;
        for (int i=0; i<compression.size(); i++) {
            int length = compression.get(i).length();
            if (length < min) {
                min = length;
            }
        }

        return min;
    }

    public List<String> compression(final String original) {
        HashSet<String> set = new HashSet<>();

        for (int i = 1; i <= original.length(); i++) {
            List<String> cutList = cutString(original, i);

            String result = original;
            for (int j = 0; j < cutList.size(); j++) {
                String cut = cutList.get(j);
                result = replaceString(changeString(result, cut), cut);
            }

            set.add(result);
        }

        return new ArrayList<>(set);
    }

    public List<String> cutString(String string, int number) {
        Set<String> set = new HashSet<>();

        int start = 0;
        while (start + number <= string.length()) {
            int end = start + number;
            set.add(string.substring(start, end));
            start = end;
        }

        return new ArrayList<>(set);
    }

    public String replaceString(final String string, String target) {
        String result = "";

        if (string.indexOf("#") != -1) {
            String change = changeString(string, target);

            int count = 0;
            while (0 < change.length()) {
                char c = change.charAt(0);

                if (c == '#') {
                    count++;
                    change = change.replaceFirst("#", "");
                }

                if (c != '#') {
                    if (count == 0) {
                        result += c;
                        change = change.replaceFirst(String.valueOf(c), "");
                    }
                    if (count == 1) {
                        result += target;
                    }
                    if (1 < count) {
                        result += count + target;
                    }

                    count = 0;
                }
            }

            if (change.equals("") && count != 0) {
                if (count == 1) {
                    result += target;
                }
                if (count != 1) {
                    result += count + target;
                }
            }

            return result;
        }

        return string;
    }

    public String changeString(final String string, String param) {
        String result = string;
        while (result.indexOf(param) != -1) {
            result = result.replaceFirst(param, "#");
        }

        return result;
    }
}
