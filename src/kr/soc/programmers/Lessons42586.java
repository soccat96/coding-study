package kr.soc.programmers;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lessons42586 {
    private static final int PROGRESS_MAX = 100;

    public int[] solution(int[] progresses, int[] speeds) {
        class Progress {
            private int progress;
            private int speed;

            public Progress(int progress, int speed) {
                this.progress = progress;
                this.speed = speed;
            }

            public void work() {
                if (!isDone()) {
                    this.progress += this.speed;
                    this.progress = Math.min(this.progress, PROGRESS_MAX);
                }
            }

            public boolean isDone() {
                return this.progress == PROGRESS_MAX;
            }
        }

        ArrayList<Integer> answerList = new ArrayList<>();
        LinkedList<Progress> progressLinkedList = new LinkedList<>();
        for (int i=0; i<progresses.length; i++) {
            progressLinkedList.add(new Progress(progresses[i], speeds[i]));
        }

        while (progressLinkedList.size() > 0) {
            for (Progress x : progressLinkedList) {
                x.work();
            }

            int count = 0;
            while (progressLinkedList.size() > 0) {
                Progress first = progressLinkedList.getFirst();
                if (first.isDone()) {
                    progressLinkedList.removeFirst();
                    count++;
                } else {
                    break;
                }
            }

            if (count > 0) {
                answerList.add(count);
            }
        }

        int[] returnArray = new int[answerList.size()];
        for (int i=0; i<returnArray.length; i++) {
            returnArray[i] = answerList.get(i);
        }
        return returnArray;
    }
}
