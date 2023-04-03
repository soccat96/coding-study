package kr.soc.programmers;

import kr.soc.programmers.Lessons77485;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Lessons77485Test {

    @Test
    void solution() {
        Lessons77485 c = new Lessons77485();
        assertArrayEquals(new int[]{8, 10, 25},
                c.solution(
                        6, 6,
                        new int[][]{
                                new int[]{2, 2, 5, 4},
                                new int[]{3, 3, 6, 6},
                                new int[]{5, 1, 6, 3}
                        })
        );
        assertArrayEquals(new int[]{1, 1, 5, 3},
                c.solution(
                        3, 3,
                        new int[][]{
                                new int[]{1, 1, 2, 2},
                                new int[]{1, 2, 2, 3},
                                new int[]{2, 1, 3, 2},
                                new int[]{2, 2, 3, 3}
                        })
        );
        assertArrayEquals(new int[]{1},
                c.solution(
                        100, 97,
                        new int[][]{
                                new int[]{1, 1, 100, 97}
                        })
        );
    }

    @Test
    void getArrayIndexes() {
        Lessons77485 c = new Lessons77485();
        assertArrayEquals(new int[]{1, 1, 4, 3}, c.getArrayIndexes(new int[]{2, 2, 5, 4}));
        assertArrayEquals(new int[]{2, 2, 5, 5}, c.getArrayIndexes(new int[]{3, 3, 6, 6}));
    }

    @Test
    void getX_Y() {
        Lessons77485 c = new Lessons77485();
        assertEquals(
                Arrays.asList(new String[]{
                        "1_1", "1_2", "1_3",
                        "2_3", "3_3", "4_3",
                        "4_2", "4_1",
                        "3_1", "2_1",
                }),
                c.getX_Y(new int[]{2, 2, 5, 4})
        );
    }
}