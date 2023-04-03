package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Lessons17678Test {

    @Test
    void solution() {
        Lessons17678 l = new Lessons17678();
        assertThat(l.solution(
                1, 1, 5,
                new String[]{"08:00", "08:01", "08:02", "08:03"})
        ).isEqualTo("09:00");
        assertThat(l.solution(
                2, 10, 2,
                new String[]{"09:10", "09:09", "08:00"})
        ).isEqualTo("09:09");
        assertThat(l.solution(
                2, 1, 2,
                new String[]{"09:00", "09:00", "09:00", "09:00"})
        ).isEqualTo("08:59");
        assertThat(l.solution(
                1, 1, 5,
                new String[]{"00:01", "00:01", "00:01", "00:01", "00:01"})
        ).isEqualTo("00:00");
        assertThat(l.solution(
                1, 1, 1,
                new String[]{"23:59"})
        ).isEqualTo("09:00");
        assertThat(l.solution(
                10, 60, 45,
                new String[]{"23:59","23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"})
        ).isEqualTo("18:00");
    }
}