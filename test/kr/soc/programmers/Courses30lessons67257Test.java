package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Courses30lessons67257Test {

    @Test
    void solution() {
        Courses30lessons67257 c = new Courses30lessons67257();
        assertEquals(60420, c.solution("100-200*300-500+20"));
        assertEquals(300, c.solution("50*6-3*2"));
    }

    @Test
    void getFrontNumber() {
        Courses30lessons67257 c = new Courses30lessons67257();
        Map<String, Object> frontNumber = c.getFrontNumber("100-200+300-400", 7);
        assertEquals(3, frontNumber.get("index"));
        assertEquals(200l, frontNumber.get("number"));
    }

    @Test
    void getBackNumber() {
        Courses30lessons67257 c = new Courses30lessons67257();
        Map<String, Object> backNumber = c.getBackNumber("100-200+300-400", 7);
        assertEquals(3, backNumber.get("index"));
        assertEquals(300l, backNumber.get("number"));
    }

    @Test
    void recursiveMulti() {
        Courses30lessons67257 c = new Courses30lessons67257();
        assertEquals("1000000", c.recursiveMulti("100*100*100"));
        assertEquals("100-10000", c.recursiveMulti("100-100*100"));
        assertEquals("10000-100", c.recursiveMulti("100*100-100"));
        assertEquals("100-100-100", c.recursiveMulti("100-100-100"));
    }

    @Test
    void recursivePlus() {
        Courses30lessons67257 c = new Courses30lessons67257();
        assertEquals("300", c.recursivePlus("100+100+100"));
        assertEquals("100-200", c.recursivePlus("100-100+100"));
        assertEquals("200-100", c.recursivePlus("100+100-100"));
        assertEquals("100-100-100", c.recursivePlus("100-100-100"));
    }

    @Test
    void recursiveMinus() {
        Courses30lessons67257 c = new Courses30lessons67257();
        assertEquals("-100", c.recursiveMinus("100-100-100"));
        assertEquals("0*100", c.recursiveMinus("100-100*100"));
        assertEquals("100*0", c.recursiveMinus("100*100-100"));
        assertEquals("100*100*100", c.recursiveMinus("100*100*100"));
    }
}