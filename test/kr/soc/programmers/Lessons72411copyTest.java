package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Lessons72411copyTest {

    @Test
    void solution() {
        Lessons72411copy c = new Lessons72411copy();
        assertArrayEquals(new String[]{"AC", "ACDE", "BCFG", "CDE"}, c.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4}));
        assertArrayEquals(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"}, c.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5}));
        assertArrayEquals(new String[]{"WX", "XY"}, c.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4}));
    }
}