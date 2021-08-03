package kr.soc.programmers.courses30;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Lessons42586Test {

    @Test
    void solution() {
        Lessons42586 l = new Lessons42586();

        List<Integer> return1 = Arrays.asList(2, 1);
        int[] example1 = l.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        ArrayList<Integer> answer1 = new ArrayList<>();
        for (int x : example1) {
            answer1.add(x);
        }
//        answer.add(1);
//        answer.add(2);
//        assertThat(answer).hasSameElementsAs(return1);
//        assertThat(answer).containsExactlyInAnyOrderElementsOf(return1);
        assertThat(answer1).containsExactlyElementsOf(return1);

        List<Integer> return2 = Arrays.asList(1, 3, 2);
        int[] example2 = l.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        ArrayList<Integer> answer2 = new ArrayList<>();
        for (int x : example2) {
            answer2.add(x);
        }
        assertThat(answer2).containsExactlyElementsOf(return2);
    }
}