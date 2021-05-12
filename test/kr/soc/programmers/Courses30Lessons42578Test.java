package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Courses30Lessons42578Test {

    @Test
    void solution() {
        Courses30lessons42578 c = new Courses30lessons42578();
        String[][] strings1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        assertEquals(5, c.solution(strings1));
        String[][] strings2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        assertEquals(3, c.solution(strings2));
    }
}