package kr.soc.programmers.courses30;

import kr.soc.programmers.courses30.Lessons42860;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lessons42860Test {

    @Test
    void solution() {
        Lessons42860 c = new Lessons42860();
        assertEquals(56, c.solution("JEROEN"));
        assertEquals(23, c.solution("JAN"));
        assertEquals(4, c.solution("BAABA"));
        assertEquals(0, c.solution("AAAAA"));
        assertEquals(8, c.solution("ZZAAAZZ"));
    }
}