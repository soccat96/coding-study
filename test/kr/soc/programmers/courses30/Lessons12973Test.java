package kr.soc.programmers.courses30;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Lessons12973Test {

    @Test
    void solution() {
        Lessons12973 l = new Lessons12973();
        assertEquals(1, l.solution("baabaa"));
        assertEquals(0, l.solution("cdcd"));
        assertEquals(0, l.solution("abcdefghijklmnopqrstuvwxyzaabbcddcddcddcddcabcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void list() {
        ArrayList<Character> characters = new ArrayList<>(100_000_000);
        System.out.println(characters.size());
        characters.add('a');
        System.out.println(characters.size());
        System.out.println(characters.get(characters.size() - 1));
    }
}