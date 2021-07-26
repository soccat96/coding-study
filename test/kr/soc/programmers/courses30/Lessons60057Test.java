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
    void getResultString() {
        Lessons60057 l = new Lessons60057();
        assertThat(
                l.getResultString(
                        "ababcdcdababcdcd",
                        l.cutString("ababcdcdababcdcd", 2),
                        2
                )
        ).isEqualTo("2ab2cd2ab2cd");
        assertThat(
                l.getResultString(
                        "ababcdcdabcdabcdefcdcdx",
                        l.cutString("ababcdcdabcdabcdefcdcdx", 2),
                        2
                )
        ).isEqualTo("2ab2cdabcdabcdef2cdx");
    }

    @Test
    void replaceStringList() {
        Lessons60057 l = new Lessons60057();
        assertThat(
                l.replaceStringList(
                        l.getPiecesOfString("ababababab", "ab".length()),
                        "ab"
                )
        ).hasSameElementsAs(Arrays.asList(new String[]{"5ab"}));
        assertThat(
                l.replaceStringList(
                        l.getPiecesOfString("ababcdcdababcdcd", "ab".length()),
                        "ab"
                )
        ).hasSameElementsAs(Arrays.asList(new String[]{"2ab", "cd", "cd", "2ab", "cd", "cd"}));
    }

    @Test
    void getPieceOfString() {
        Lessons60057 l = new Lessons60057();
        assertThat(l.getPiecesOfString("ababcdcdabcdabcdefcdcd", 2))
                .hasSameElementsAs(Arrays.asList(new String[]{
                        "ab", "ab", "cd", "cd", "ab", "cd", "ab", "cd", "ef", "cd", "cd"
                }));
        assertThat(l.getPiecesOfString("ababcdcdabcdabcdefcdcdx", 2))
                .hasSameElementsAs(Arrays.asList(new String[]{
                        "ab", "ab", "cd", "cd", "ab", "cd", "ab", "cd", "ef", "cd", "cd", "x"
                }));
    }
}