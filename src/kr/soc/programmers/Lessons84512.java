package kr.soc.programmers;

public class Lessons84512 {
    public int solution(String word) {
        int answer = 0;

        for (int i=0; i<word.length(); i++) {
            switch (word.charAt(i)) {
                case 'A':
                    answer += 1;
                    break;
                case 'E':
                    answer += 2;
                    for (int j=1; j<=4-i; j++) {
                        answer += 1 * Math.pow(5, j);
                    }
                    break;
                case 'I':
                    answer += 3;
                    for (int j=1; j<=4-i; j++) {
                        answer += 2 * Math.pow(5, j);
                    }
                    break;
                case 'O':
                    answer += 4;
                    for (int j=1; j<=4-i; j++) {
                        answer += 3 * Math.pow(5, j);
                    }
                    break;
                case 'U':
                    answer += 5;
                    for (int j=1; j<=4-i; j++) {
                        answer += 4 * Math.pow(5, j);
                    }
                    break;
            }

//            if (i == 0) {
//                switch (word.charAt(0)) {
//                    case 'A':
//                        answer += 1;
//                        break;
//                    case 'E':
//                        answer += 2;
//                        answer += 1 * 5;
//                        answer += 1 * 5 * 5;
//                        answer += 1 * 5 * 5 * 5;
//                        answer += 1 * 5 * 5 * 5 * 5;
//                        break;
//                    case 'I':
//                        answer += 3;
//                        answer += 2 * 5;
//                        answer += 2 * 5 * 5;
//                        answer += 2 * 5 * 5 * 5;
//                        answer += 2 * 5 * 5 * 5 * 5;
//                        break;
//                    case 'O':
//                        answer += 4;
//                        answer += 3 * 5;
//                        answer += 3 * 5 * 5;
//                        answer += 3 * 5 * 5 * 5;
//                        answer += 3 * 5 * 5 * 5 * 5;
//                        break;
//                    case 'U':
//                        answer += 5;
//                        answer += 4 * 5;
//                        answer += 4 * 5 * 5;
//                        answer += 4 * 5 * 5 * 5;
//                        answer += 4 * 5 * 5 * 5 * 5;
//                        break;
//                }
//            }
//
//            if (i == 1) {
//                switch (word.charAt(1)) {
//                    case 'A':
//                        answer += 1;
//                        break;
//                    case 'E':
//                        answer += 2;
//                        answer += 1 * 5;
//                        answer += 1 * 5 * 5;
//                        answer += 1 * 5 * 5 * 5;
//                        break;
//                    case 'I':
//                        answer += 3;
//                        answer += 2 * 5;
//                        answer += 2 * 5 * 5;
//                        answer += 2 * 5 * 5 * 5;
//                        break;
//                    case 'O':
//                        answer += 4;
//                        answer += 3 * 5;
//                        answer += 3 * 5 * 5;
//                        answer += 3 * 5 * 5 * 5;
//                        break;
//                    case 'U':
//                        answer += 5;
//                        answer += 4 * 5;
//                        answer += 4 * 5 * 5;
//                        answer += 4 * 5 * 5 * 5;
//                        break;
//                }
//            }
//
//            if (i == 2) {
//                switch (word.charAt(2)) {
//                    case 'A':
//                        answer += 1;
//                        break;
//                    case 'E':
//                        answer += 2;
//                        answer += 1 * 5;
//                        answer += 1 * 5 * 5;
//                        break;
//                    case 'I':
//                        answer += 3;
//                        answer += 2 * 5;
//                        answer += 2 * 5 * 5;
//                        break;
//                    case 'O':
//                        answer += 4;
//                        answer += 3 * 5;
//                        answer += 3 * 5 * 5;
//                        break;
//                    case 'U':
//                        answer += 5;
//                        answer += 4 * 5;
//                        answer += 4 * 5 * 5;
//                        break;
//                }
//            }
//
//            if (i == 3) {
//                switch (word.charAt(3)) {
//                    case 'A':
//                        answer += 1;
//                        break;
//                    case 'E':
//                        answer += 2;
//                        answer += 1 * 5;
//                        break;
//                    case 'I':
//                        answer += 3;
//                        answer += 2 * 5;
//                        break;
//                    case 'O':
//                        answer += 4;
//                        answer += 3 * 5;
//                        break;
//                    case 'U':
//                        answer += 5;
//                        answer += 4 * 5;
//                        break;
//                }
//            }
//
//            if (i == 4) {
//                switch (word.charAt(4)) {
//                    case 'A':
//                        answer += 1;
//                        break;
//                    case 'E':
//                        answer += 2;
//                        break;
//                    case 'I':
//                        answer += 3;
//                        break;
//                    case 'O':
//                        answer += 4;
//                        break;
//                    case 'U':
//                        answer += 5;
//                        break;
//                }
//            }
        }

        return answer;
    }
}
