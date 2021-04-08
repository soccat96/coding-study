package kr.soc.programmers

import java.util.Stack

fun main() {
    class Solution {
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

    var board = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 3),
            intArrayOf(0, 2, 5, 0, 1),
            intArrayOf(4, 2, 4, 4, 2),
            intArrayOf(3, 5, 1, 3, 1)
    )
    var moves = intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
    print(Solution().solution(board, moves))
}