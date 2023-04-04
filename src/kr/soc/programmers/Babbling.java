package kr.soc.programmers;

public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] canSpeak = {"aya", "ye", "woo", "ma"};
        for (String x: babbling) {
            String s = x
                    .replaceFirst(canSpeak[0], "0")
                    .replaceFirst(canSpeak[1], "0")
                    .replaceFirst(canSpeak[2], "0")
                    .replaceFirst(canSpeak[3], "0");

            s = s.replaceAll("0", "");
            if (s.isBlank()) answer++;
        }

        return answer;
    }
}
