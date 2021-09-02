package kr.soc.programmers.courses30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class Lessons84512Test {

    @Test
    void solution() {
//        word	result
//        "AAAAE"	6
//        "AAAE"	10
//        "I"	1563
//        "EIO"	1189
        Lessons84512 l = new Lessons84512();
        assertThat(l.solution("AAAAE")).isEqualTo(6);
        assertThat(l.solution("AAAE")).isEqualTo(10);
        assertThat(l.solution("I")).isEqualTo(1563);
        assertThat(l.solution("EIO")).isEqualTo(1189);
    }
}