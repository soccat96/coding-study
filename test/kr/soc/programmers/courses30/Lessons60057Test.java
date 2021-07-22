package kr.soc.programmers.courses30;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Lessons60057Test {

    @Test
    void solution() {
        Lessons60057 l = new Lessons60057();
        assertEquals(7, l.solution("aabbaccc"));
        assertEquals(9, l.solution("ababcdcdababcdcd"));
        assertEquals(8, l.solution("abcabcdede"));
        assertEquals(14, l.solution("abcabcabcabcdededededede"));
        assertEquals(17, l.solution("xababcdcdababcdcd"));
        assertEquals(5, l.solution("xxxxxxxxxxyyy"));
        assertEquals(9, l.solution("acacacbacacac"));
        assertEquals(9, l.solution("acacacacacacbacacacacacac"));
        assertEquals(4, l.solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    void compression() {
        Lessons60057 l = new Lessons60057();
        assertThat(l.compression("ababcdcdababcdcd")).hasSameElementsAs(Arrays.asList(new String[]{"ababcdcdababcdcd", "2ababcdcd", "2ab2cd2ab2cd"}));
    }

    @Test
    void cutString() {
        Lessons60057 l = new Lessons60057();
        assertThat(l.cutString("aabbaccc", 1)).hasSameElementsAs(Arrays.asList(new String[]{"a", "b", "c"}));
        assertThat(l.cutString("aabbaccc", 2)).hasSameElementsAs(Arrays.asList(new String[]{"aa", "bb", "ac", "cc"}));
        assertThat(l.cutString("aabbaccc", 3)).hasSameElementsAs(Arrays.asList(new String[]{"bac", "aab"}));
        assertThat(l.cutString("aabbaccc", 4)).hasSameElementsAs(Arrays.asList(new String[]{"aabb", "accc"}));
        assertThat(l.cutString("aabbaccc", 5)).hasSameElementsAs(Arrays.asList(new String[]{"aabba"}));
        assertThat(l.cutString("aabbaccc", 6)).hasSameElementsAs(Arrays.asList(new String[]{"aabbac"}));
        assertThat(l.cutString("aabbaccc", 7)).hasSameElementsAs(Arrays.asList(new String[]{"aabbacc"}));
        assertThat(l.cutString("aabbaccc", 8)).hasSameElementsAs(Arrays.asList(new String[]{"aabbaccc"}));
    }

    @Test
    void replaceString() {
        Lessons60057 l = new Lessons60057();
        assertThat(l.replaceString("ababababab", "ab")).isEqualTo("5ab");
        assertThat(l.replaceString("ababcdcdababcdcd", "ab")).isEqualTo("2abcdcd2abcdcd");
    }

    @Test
    void changeString() {
        Lessons60057 l = new Lessons60057();
        assertThat(l.changeString("ababababab", "ab")).isEqualTo("#####");
        assertThat(l.changeString("ababcdcdababcdcd", "ab")).isEqualTo("##cdcd##cdcd");
        assertThat(l.changeString("ababcdcdabcdcd", "ab")).isEqualTo("##cdcd#cdcd");
        assertThat(l.changeString("ababcdcdabcdabcdefcdcd", "ab")).isEqualTo("##cdcd#cd#cdefcdcd");
    }
}