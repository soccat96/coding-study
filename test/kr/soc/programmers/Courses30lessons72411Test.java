package kr.soc.programmers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Courses30lessons72411Test {

    @Test
    void solution() {
        Courses30lessons72411 c = new Courses30lessons72411();
        assertArrayEquals(new String[]{"AC", "ACDE", "BCFG", "CDE"}, c.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4}));
        assertArrayEquals(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"}, c.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5}));
        assertArrayEquals(new String[]{"WX", "XY"}, c.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4}));
    }
}