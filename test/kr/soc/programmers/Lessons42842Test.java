package kr.soc.programmers;

import kr.soc.programmers.Lessons42842;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lessons42842Test {

    @Test
    void solution() {
        Lessons42842 c = new Lessons42842();
        assertArrayEquals(new int[]{4, 3}, c.solution(10, 2));
        assertArrayEquals(new int[]{3, 3}, c.solution(8, 1));
        assertArrayEquals(new int[]{8, 6}, c.solution(24, 24));
    }
}