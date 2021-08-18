package kr.soc.programmers.courses30;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.LinkedList;

public class Lessons17678 {
    private static final LocalTime START_TIME = LocalTime.of(9, 0, 0, 0);

    public String solution(int n, int t, int m, String[] timetable) {
//        final int TOTAL_COUNT = n * m;
        final LocalTime LAST_TIME = START_TIME.plusMinutes((long) (n - 1) * t);

        LinkedList<LocalTime> localTimeLinkedList = new LinkedList<>();
        for (String s : timetable) {
            LocalTime crew = LocalTime.parse(s);
            if (!crew.isAfter(LAST_TIME)) localTimeLinkedList.add(crew);
        }
        Collections.sort(localTimeLinkedList);
//        final int COMPETITOR_COUNT = localTimeLinkedList.size();

        LocalTime startLt = START_TIME.plusNanos(0);
        LocalTime lastCrew = LocalTime.of(23, 59, 0, 0);
        for (int i=0; i<n; i++) {
            if (i!=0) startLt = startLt.plusMinutes(t);

            int cnt = 0;
            while (!localTimeLinkedList.isEmpty()) {
                LocalTime crew = localTimeLinkedList.getFirst();
                if (crew.isBefore(startLt) || crew.equals(startLt)) {
                    localTimeLinkedList.pollFirst();
                    lastCrew = crew.plusNanos(0);
                    cnt++;
                }

                if (m <= cnt) {
                    if (i == n - 1) {
                        return lastCrew.minusMinutes(1).format(DateTimeFormatter.ofPattern("HH:mm"));
                    }

                    break;
                }

                if (crew.isAfter(startLt)) break;
            }
        }

        return startLt.format(DateTimeFormatter.ofPattern("HH:mm"));
    }
}
