package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Courses30lessons42583Test {

    @Test
    void solution() {
        Courses30lessons42583 lessons42583 = new Courses30lessons42583();
        assertEquals(8, lessons42583.solution(2, 10, new int[]{7, 4, 5, 6}));
        assertEquals(101, lessons42583.solution(100, 100, new int[]{10}));
        assertEquals(110, lessons42583.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }
}