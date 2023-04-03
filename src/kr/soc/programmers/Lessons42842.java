package kr.soc.programmers;

import java.util.*;

public class Lessons42842 {
    public int[] solution(int brown, int yellow) {
        List<Map<String, Integer>> colRowList = getColRow(yellow);
        for (Map<String, Integer> x : colRowList) {
            int maybeBrown = (x.get("col") * 2) + ((x.get("row") + 2) * 2);
            if (brown == maybeBrown) {
                return new int[]{x.get("col") + 2, x.get("row") + 2};
            }
        }

        return null;
    }

    private List<Map<String, Integer>> getColRow(int yellow) {
        ArrayList<Map<String, Integer>> returnList = new ArrayList<>();

        for (int row = 1; row <= (yellow / 2) + 1; row++) {
            if (yellow % row == 0) {
                HashMap<String, Integer> map = new HashMap<>();
                map.put("col", yellow / row);
                map.put("row", row);
                returnList.add(map);
            }
        }

        return returnList;
    }
}
