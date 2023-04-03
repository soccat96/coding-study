package kr.soc.programmers

import java.util.Stack

class Lessons64061kt {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer: Int = 0;

        var box = Stack<Int>();
        for(i in moves.indices) {
            var doll: Int = 0
            for(j in board.indices) {
                if(board[j][moves[i]-1] != 0) {
                    doll = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0

                    break;
                }
            }

            if(doll != 0) {
                if(box.empty()) {
                    box.push(doll)
                    continue;
                }

                if(box.peek() == doll) {
                    box.pop()
                    answer += 2
                    continue
                }

                if(box.peek() != doll) {
                    box.push(doll)
                    continue
                }
            }
        }

        return answer;
    }
}

