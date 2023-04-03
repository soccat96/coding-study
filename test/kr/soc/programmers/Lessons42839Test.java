package kr.soc.programmers;

import kr.soc.programmers.Lessons42839;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lessons42839Test {

    @Test
    void isPrimeNumber() {
        Lessons42839 c = new Lessons42839();
        assertEquals(false, c.isPrimeNumber( 0));
        assertEquals(false, c.isPrimeNumber( 1));
        assertEquals(true,  c.isPrimeNumber( 2));
        assertEquals(true,  c.isPrimeNumber( 3));
        assertEquals(false, c.isPrimeNumber( 4));
        assertEquals(true,  c.isPrimeNumber( 5));
        assertEquals(false, c.isPrimeNumber( 6));
        assertEquals(true,  c.isPrimeNumber( 7));
        assertEquals(false, c.isPrimeNumber( 8));
        assertEquals(false, c.isPrimeNumber( 9));
        assertEquals(false, c.isPrimeNumber(10));
        assertEquals(true,  c.isPrimeNumber(11));
        assertEquals(false, c.isPrimeNumber(12));
        assertEquals(true,  c.isPrimeNumber(13));
        assertEquals(false, c.isPrimeNumber(14));
        assertEquals(false, c.isPrimeNumber(15));
        assertEquals(false, c.isPrimeNumber(16));
        assertEquals(true,  c.isPrimeNumber(17));
        assertEquals(false, c.isPrimeNumber(18));
        assertEquals(true,  c.isPrimeNumber(19));
        assertEquals(false, c.isPrimeNumber(20));
        assertEquals(true,  c.isPrimeNumber(23));
    }

    @Test
    void removeFrontZero() {
        Lessons42839 c = new Lessons42839();
        assertEquals("12345", c.removeFrontZero("012345"));
        assertEquals("12345", c.removeFrontZero("000012345"));
        assertEquals("102000300405", c.removeFrontZero("0000102000300405"));
        assertEquals("12345000", c.removeFrontZero("000012345000"));
        assertEquals("0", c.removeFrontZero("0000000"));
    }

    @Test
    void solution() {
        Lessons42839 c = new Lessons42839();
        assertEquals(3, c.solution("17"));
        assertEquals(2, c.solution("011"));
    }
}