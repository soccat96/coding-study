package kr.soc.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Lessons64065Test {

    @Test
    void getStringList() {
//        Lessons64065 l = new Lessons64065();
//        assertThat(l.getStringList("2},{2,1},{2,1,3},{2,1,3,4"))
//                .containsExactlyElementsOf(Arrays.asList(new String[]{"2", "2,1", "2,1,3", "2,1,3,4"}));
//        assertThat(l.getStringList("1,2,3},{2,1},{1,2,4,3},{2"))
//                .containsExactlyElementsOf(Arrays.asList(new String[]{"1,2,3", "2,1", "1,2,4,3", "2"}));
//        assertThat(l.getStringList("20,111},{111"))
//                .containsExactlyElementsOf(Arrays.asList(new String[]{"20,111", "111"}));
//        assertThat(l.getStringList("123"))
//                .containsExactlyElementsOf(Arrays.asList(new String[]{"123"}));
//        assertThat(l.getStringList("4,2,3},{3},{2,3,4,1},{2,3"))
//                .containsExactlyElementsOf(Arrays.asList(new String[]{"4,2,3", "3", "2,3,4,1", "2,3"}));
    }

    @Test
    void solution() {
        Lessons64065 l = new Lessons64065();
        assertThat(l.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"))
                .isEqualTo(new int[]{2, 1, 3, 4});
        assertThat(l.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"))
                .isEqualTo(new int[]{2, 1, 3, 4});
        assertThat(l.solution("{{20,111},{111}}"))
                .isEqualTo(new int[]{111, 20});
        assertThat(l.solution("{{123}}"))
                .isEqualTo(new int[]{123});
        assertThat(l.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"))
                .isEqualTo(new int[]{3, 2, 4, 1});
    }

    @Test
    void replace() {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

        String replace = s.replace("{{", ";;");
        System.out.println(replace);
    }
}