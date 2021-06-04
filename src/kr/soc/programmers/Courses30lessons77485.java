package kr.soc.programmers;

import java.util.*;

public class Courses30lessons77485 {
    class Point {
        private int row;
        private int column;

        private int nextRow;
        private int nextColumn;

        private int value;

        public Point(int row, int column, int[] indexes) {
            this.row = row;
            this.column = column;

            if (row == indexes[0]) {
                if (column == indexes[3]) {
                    this.nextRow = row + 1;
                    this.nextColumn = column;
                }
                if (column != indexes[3]) {
                    this.nextRow = row;
                    this.nextColumn = column + 1;
                }
            }else if(column == indexes[3]) {
                if (row == indexes[2]) {
                    this.nextRow = row;
                    this.nextColumn = column - 1;
                }
                if (row != indexes[2]) {
                    this.nextRow = row + 1;
                    this.nextColumn = column;
                }
            } else if (row == indexes[2]) {
                if(column == indexes[1]) {
                    this.nextRow = row - 1;
                    this.nextColumn = column;
                }
                if(column != indexes[1]) {
                    this.nextRow = row;
                    this.nextColumn = column - 1;
                }
            } else if (column == indexes[1]) {
                this.nextRow = row - 1;
                this.nextColumn = column;
            }
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        public int getNextRow() {
            return nextRow;
        }

        public int getNextColumn() {
            return nextColumn;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] rows_columns = new int[rows][columns];
        int cnt = 1;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                rows_columns[i][j] = cnt++;
            }
        }

        for (int i=0; i<queries.length; i++) {
            int minValue = Integer.MAX_VALUE;

            List<Point> pointList = getPointList(queries[i]);
            for(Point p : pointList) {
                p.setValue(rows_columns[p.getRow()][p.getColumn()]);
            }
            for(Point p : pointList) {
                if(p.getValue() < minValue) {
                    minValue = p.getValue();
                }

                rows_columns[p.getNextRow()][p.getNextColumn()] = p.getValue();
            }

            answer[i] = minValue;
        }

        return answer;
    }

    public int[] getArrayIndexes(int[] query) {
        int[] indexes = new int[query.length];

        for (int i=0; i<query.length; i++) {
            indexes[i] = query[i] - 1;
        }

        return indexes;
    }

    public List<Point> getPointList(int[] query) {
        ArrayList<Point> pointList = new ArrayList<>();

        int[] indexes = getArrayIndexes(query);
        // line 1
        for (int i=indexes[1]; i<=indexes[3]; i++) {
            pointList.add(new Point(indexes[0], i, indexes));
        }

        // line 2
        for (int i=indexes[0] + 1; i<=indexes[2]; i++) {
            pointList.add(new Point(i, indexes[3], indexes));
        }

        // line 3
        for (int i=indexes[3] - 1; i>=indexes[1]; i--) {
            pointList.add(new Point(indexes[2], i, indexes));
        }

        // line 4
        for (int i=indexes[2] - 1; i>= indexes[0] + 1; i--) {
            pointList.add(new Point(i, indexes[1], indexes));
        }

        return pointList;
    }

    // for test
    public List<String> getX_Y(int[] query) {
        ArrayList<String> strings = new ArrayList<>();

        int[] indexes = getArrayIndexes(query);
        // line 1
        for (int i=indexes[1]; i<=indexes[3]; i++) {
            strings.add(indexes[0] + "_" + i);
        }

        // line 2
        for (int i=indexes[0] + 1; i<=indexes[2]; i++) {
            strings.add(i + "_" + indexes[3]);
        }

        // line 3
        for (int i=indexes[3] - 1; i>=indexes[1]; i--) {
            strings.add(indexes[2] + "_" + i);
        }

        // line 4
        for (int i=indexes[2] - 1; i>= indexes[0] + 1; i--) {
            strings.add(i + "_" + indexes[1]);
        }

        return strings;
    }
}
