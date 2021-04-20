package kr.soc.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Courses30Lessons42587Test {

    private Courses30lessons42587 courses30lessons42587 = null;

    @BeforeEach
    void setUp() {
        courses30lessons42587 = new Courses30lessons42587();
    }

    @Test
    void solution() {
        assertEquals(1, courses30lessons42587.solution(new int[]{2, 1, 3, 2}, 2));
        assertEquals(5, courses30lessons42587.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}