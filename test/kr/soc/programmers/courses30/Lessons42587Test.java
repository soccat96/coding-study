package kr.soc.programmers.courses30;

import kr.soc.programmers.courses30.Lessons42587;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lessons42587Test {

    private Lessons42587 lessons42587 = null;

    @BeforeEach
    void setUp() {
        lessons42587 = new Lessons42587();
    }

    @Test
    void solution() {
        assertEquals(1, lessons42587.solution(new int[]{2, 1, 3, 2}, 2));
        assertEquals(5, lessons42587.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}