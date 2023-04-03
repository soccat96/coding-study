package kr.soc.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lessons64061Test {
    private Lessons64061kt lessons64061Kt;

    @BeforeEach
    public void setUp() {
        lessons64061Kt = new Lessons64061kt();
    }

    @Test
    void solution() {
        int[][] board = new int[][]{
                new int[]{0,0,0,0,0},
                new int[]{0,0,1,0,3},
                new int[]{0,2,5,0,1},
                new int[]{4,2,4,4,2},
                new int[]{3,5,1,3,1}
        };
        int[] moves = new int[]{1,5,3,5,1,2,1,4};
        assertEquals(4, lessons64061Kt.solution(board, moves));
    }
}