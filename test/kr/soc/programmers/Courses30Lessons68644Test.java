package kr.soc.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Courses30Lessons68644Test {

    private Courses30lessons68644kt courses30Lessons68644Kt;

    @BeforeEach
    void setUp() {
        courses30Lessons68644Kt = new Courses30lessons68644kt();
    }

    @Test
    void solution() {
        int[] test1 = courses30Lessons68644Kt.solution(new int[]{2, 1, 3, 4, 1});
        int[] test2 = courses30Lessons68644Kt.solution(new int[]{5, 0, 2, 7});
        int[] test3 = courses30Lessons68644Kt.solution(new int[]{0, 100, 1000, 10});
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7}, test1);
        assertArrayEquals(new int[]{2, 5, 7, 9, 12}, test2);
        assertArrayEquals(new int[]{10, 100, 110, 1000, 1010, 1100}, test3);
    }
}