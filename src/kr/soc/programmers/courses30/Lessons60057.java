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
            set.add(getResultString(original, cutList, i));
        }

        return new ArrayList<>(set);
    }

    public List<String> cutString(final String string, int number) {
        Set<String> set = new HashSet<>();

        int start = 0;
        while (start + number <= string.length()) {
            int end = start + number;
            set.add(string.substring(start, end));
            start = end;
        }

        return new ArrayList<>(set);
    }

    public String getResultString(final String string, List<String> cutList, final int length) {
        String result = "";

        List<String> piecesOfString = getPiecesOfString(string, length);
        for (int i=0; i<cutList.size(); i++) {
            String cut = cutList.get(i);
            piecesOfString = replaceStringList(piecesOfString, cut);
        }
        for (String x : piecesOfString) {
            result += x;
        }

        return result;
    }

    public List<String> replaceStringList(List<String> piecesOfString, final String target) {
        ArrayList<String> returnList = new ArrayList<>();

        int count = 0;
        while (0 < piecesOfString.size()) {
            String s = piecesOfString.get(0);

            if (s.equals(target)) {
                count++;
            }

            if (!s.equals(target)) {
                if (count == 1) {
                    returnList.add(target);
                }
                if (1 < count) {
                    returnList.add(count + target);
                }
                returnList.add(s);

                count = 0;
            }

            piecesOfString.remove(0);
        }

        if (piecesOfString.size() == 0 && count != 0) {
            if (count <= 1) {
                returnList.add(target);
            }
            if (1 < count) {
                returnList.add(count + target);
            }
        }

        return returnList;
    }

    public List<String> getPiecesOfString(final String string, final int length) {
        ArrayList<String> returnList = new ArrayList<>();

        String temp = string;
        while (length < temp.length()) {
            returnList.add(temp.substring(0, length));
            temp = temp.substring(length);
        }
        returnList.add(temp);

        return returnList;
    }
}
