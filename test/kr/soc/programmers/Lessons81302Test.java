package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Lessons81302Test {

    @Test
    void solution() {
        Lessons81302 l = new Lessons81302();
        assertArrayEquals(
                new int[]{0},
                l.solution(new String[][]{
                        new String[]{"OOPOO", "OPOOO", "OOOOO", "OOOOO", "OOOOO"}
                })
        );
        assertArrayEquals(
                new int[]{1, 0, 1, 1, 1},
                l.solution(new String[][]{
                        new String[]{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                        new String[]{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                        new String[]{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                        new String[]{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                        new String[]{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
                })
        );
    }
}