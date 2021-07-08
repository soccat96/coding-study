package kr.soc.programmers.courses30;

public class Lessons62048 {
    public long solution(int w, int h) {
        long answer = 0;

        double dw = Integer.valueOf(w).doubleValue();
        double dh = Integer.valueOf(h).doubleValue();

        for(int i=1; i<w; i++) {
            answer += Math.floor(dh * i / dw);
        }

        return answer * 2;
    }
}
