package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Courses30lessons42860Test {

    @Test
    void solution() {
        Courses30lessons42860 c = new Courses30lessons42860();
        assertEquals(56, c.solution("JEROEN"));
        assertEquals(23, c.solution("JAN"));
        assertEquals(4, c.solution("BAABA"));
        assertEquals(0, c.solution("AAAAA"));
        assertEquals(8, c.solution("ZZAAAZZ"));
    }
}