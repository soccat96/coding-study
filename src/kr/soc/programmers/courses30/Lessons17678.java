package kr.soc.programmers.courses30;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.LinkedList;

public class Lessons17678 {
    public String solution(int n, int t, int m, String[] timetable) {
        final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
        final LocalTime SHUTTLE_START_TIME = LocalTime.of(9, 0, 0, 0);
        final LocalTime SHUTTLE_LAST_TIME = SHUTTLE_START_TIME.plusMinutes((long) (n - 1) * t);
//        final int TOTAL_COUNT = n * m;

        LinkedList<LocalTime> crewList = new LinkedList<>();
        for (String s : timetable) {
            LocalTime crew = LocalTime.parse(s, FORMATTER);
            if (!crew.isAfter(SHUTTLE_LAST_TIME)) crewList.add(crew);
        }
        Collections.sort(crewList);
//        final int COMPETITOR_COUNT = localTimeLinkedList.size();

        LocalTime startLt = SHUTTLE_START_TIME.plusNanos(0);
        LocalTime lastCrew = LocalTime.of(23, 59, 0, 0);
        for (int i=0; i<n; i++) {
            if (i!=0) startLt = startLt.plusMinutes(t);

            int cnt = 0;
            while (!crewList.isEmpty()) {
                LocalTime crew = crewList.getFirst();
                if (crew.isBefore(startLt) || crew.equals(startLt)) {
                    crewList.pollFirst();
                    lastCrew = crew.plusNanos(0);
                    cnt++;
                }

                if (m <= cnt) {
                    if (startLt.equals(SHUTTLE_LAST_TIME)) {
                        return lastCrew.minusMinutes(1).format(FORMATTER);
                    }

                    break;
                }

                if (crew.isAfter(startLt)) break;
            }
        }

        return startLt.format(FORMATTER);
    }
}
