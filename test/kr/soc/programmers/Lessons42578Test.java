package kr.soc.programmers;

import kr.soc.programmers.Lessons42578;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lessons42578Test {

    @Test
    void solution() {
        Lessons42578 c = new Lessons42578();
        String[][] strings1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        assertEquals(5, c.solution(strings1));
        String[][] strings2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        assertEquals(3, c.solution(strings2));
    }
}