package kr.soc.programmers;

public class Lessons81302 {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            answer[i] = 1;

            int[][] array = new int[5][5];
            setArray(places[i], array);

            rowFor: for (int row = 0; row < 5; row++) {
                colFor: for (int col = 0; col < 5; col++) {
                    if (array[row][col] == 1) {
                        answer[i] = getResult(row, col, array);

                        if (answer[i] == 0) {
                            break rowFor;
                        }
                    }
                }
            }
        }

        return answer;
    }

    public int getManhattanDistance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    public void setArray(String[] strings, int[][] array) {
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            for (int j = 0; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case 'P':
                        array[i][j] = 1;
                        break;
                    case 'X':
                        array[i][j] = -1;
                        break;
                    default:
                        array[i][j] = 0;
                        break;
                }
            }
        }
    }

    public int getResult(int row, int col, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (row == i && col == j) {
                    continue;
                }

                int value = array[i][j];
                if (value != 1) {
                    continue;
                }

                int manhattanDistance = getManhattanDistance(new int[]{row, col}, new int[]{i, j});
                if (2 < manhattanDistance) {
                    continue;
                }

                if (1 == manhattanDistance) {
                    if (1 == value) {
                        return 0;
                    }
                }

                if (2 == manhattanDistance) {
                    if (row == i) {
                        if (col < j) {
                            if (1 <= (array[i][j - 1] + value)) {
                                return 0;
                            }
                        }
                        if (j < col) {
                            if (1 <= (array[i][j + 1] + value)) {
                                return 0;
                            }
                        }
                    } else if (col == j) {
                        if (row < i) {
                            if (1 <= (array[i - 1][j] + value)) {
                                return 0;
                            }
                        }
                        if (i < row) {
                            if (1 <= (array[i + 1][j] + value)) {
                                return 0;
                            }
                        }
                    } else {
                        // left up
                        if (i == row - 1 && j == col - 1) {
                            if (1 <= array[i + 1][j] + value || 1 <= array[i][j + 1] + value) {
                                return 0;
                            }
                        }
                        // left down
                        if (i == row + 1 && j == col - 1) {
                            if (1 <= array[i - 1][j] + value || 1 <= array[i][j + 1] + value) {
                                return 0;
                            }
                        }
                        // right up
                        if (i == row - 1 && j == col + 1) {
                            if (1 <= array[i][j - 1] + value || 1 <= array[i + 1][j] + value) {
                                return 0;
                            }
                        }
                        // right down
                        if (i == row + 1 && j == col + 1) {
                            if (1 <= array[i - 1][j] + value || 1 <= array[i][j - 1] + value) {
                                return 0;
                            }
                        }
                    }
                }
            }
        }

        return 1;
    }
}
