package kr.soc.programmers;

import java.util.*;

public class Courses30lessons42587 {
    public int solution(int[] priorities, int location) {
        class Document {
            private int position;
            private int priority;

            public Document(int position, int priority) {
                this.position = position;
                this.priority = priority;
            }

            public int getPosition() {
                return position;
            }

            public int getPriority() {
                return priority;
            }
        }

        ArrayList<Document> documentArrayList = new ArrayList<>();
        LinkedList<Document> documentLinkedList = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            documentLinkedList.offer(new Document(i, priorities[i]));
        }

        while (!documentLinkedList.isEmpty()) {
            Document poll = documentLinkedList.poll();
            boolean flag = true;
            for(int i=0; i<documentLinkedList.size(); i++) {
                if(poll.getPriority() < documentLinkedList.get(i).getPriority()) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                documentArrayList.add(poll);
                continue;
            }

            documentLinkedList.offer(poll);
        }

        for(int i=0; i<documentArrayList.size(); i++) {
            if(documentArrayList.get(i).getPosition() == location) {
                return i + 1;
            }
        }

        return 0;
    }
}
