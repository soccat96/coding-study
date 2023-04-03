package kr.soc.programmers;

import java.util.Stack;

public class Lessons64061 {
    // board [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
    // moves [1,5,3,5,1,2,1,4]
    // result 4
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> box = new Stack<>();
        for(int i=0; i<moves.length; i++) {
            int doll = 0;
            for(int j=0; j<board.length; j++) {
                if(board[j][moves[i]-1] != 0){
                    doll = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;

                    break;
                }
            }

            if(doll != 0) {
                if (box.isEmpty()) {
                    box.push(doll);
                    continue;
                }

                if(box.peek() == doll) {
                    box.pop();
                    answer += 2;
                    continue;
                }

                if(box.peek() != doll) {
                    box.push(doll);
                    continue;
                }
            }
        }

        return answer;
    }
}
