package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
class MemoryScoreJavaTest {

    @Test
    public void assertThatTest() {
        assertThat("a").isEqualTo("a");
    }
    @Test
    public void test() {
//        ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]	[19, 15, 6]
//        ["kali", "mari", "don"]	[11, 1, 55]	[["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]	[67, 0, 55]
//        ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may"],["kein", "deny", "may"], ["kon", "coni"]]	[5, 15, 0]
        MemoryScoreJava memoryScoreJava = new MemoryScoreJava();
        assertArrayEquals(
                memoryScoreJava.solution(
                    new String[]{"may", "kein", "kain", "radi"},
                    new int[]{5, 10, 1, 3},
                    new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}
                ),
                new int[]{19, 15, 6}
        );
        assertArrayEquals(
                memoryScoreJava.solution(
                        new String[]{"kali", "mari", "don"},
                        new int[]{11, 1, 55},
                        new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}}
                ),
                new int[]{67, 0, 55}
        );
        assertArrayEquals(
                memoryScoreJava.solution(
                        new String[]{"may", "kein", "kain", "radi"},
                        new int[]{5, 10, 1, 3},
                        new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}}
                ),
                new int[]{5, 15, 0}
        );
    }
}