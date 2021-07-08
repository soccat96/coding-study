package kr.soc.programmers.courses30;

import kr.soc.programmers.courses30.Lessons67257;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lessons67257Test {

    @Test
    void solution() {
        Lessons67257 c = new Lessons67257();
        assertEquals(60420, c.solution("100-200*300-500+20"));
        assertEquals(300, c.solution("50*6-3*2"));
        assertEquals(1248000, c.solution("200-300-500-600*40+500+500"));
        assertEquals(24, c.solution("2*2*2*2*2-2*2*2"));
        assertEquals(6083974714l, c.solution("177-661*999*99-133+221+334+555-166-144-551-166*166-166*166-133*88*55-11*4+55*888*454*12+11-66+444*99"));
    }
}