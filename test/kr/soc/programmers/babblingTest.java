package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class BabblingTest {
    @Test
    public void test() {
        Babbling babbling = new Babbling();
        assertThat(babbling.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"})).isEqualTo(1);
        assertThat(babbling.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"})).isEqualTo(3);
    }
}