package kr.soc.programmers;

import kr.soc.programmers.Lessons72411;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Lessons72411Test {

    @Test
    void solution() {
        Lessons72411 c = new Lessons72411();
        assertArrayEquals(new String[]{"AC", "ACDE", "BCFG", "CDE"}, c.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4}));
        assertArrayEquals(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"}, c.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5}));
        assertArrayEquals(new String[]{"WX", "XY"}, c.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4}));
    }
}