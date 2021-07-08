package kr.soc.programmers.courses30;

import java.util.TreeSet;

public class Lessons68644 {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();

        for(int i=0; i<numbers.length; i++) {
            int x = numbers[i];

            for(int j=i+1; j<numbers.length; j++) {
                set.add(x + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int k = 0;
        for(Integer x : set) {
            answer[k++] = x.intValue();
        }

        return answer;
    }
}
