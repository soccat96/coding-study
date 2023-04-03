package kr.soc.programmers;

public class Lessons42860 {
    final static int A_MIN = 10;
    final static int Z_MAX = 35;

    public int solution(String name) {
        String result = "";
        char[] chars = name.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            result += 'A';
        }

        int index = 0, change = 0, move = -1;
        do {
            move++;

            char nameAt = name.charAt(index);
            char resultAt = result.charAt(index);
            if(nameAt != resultAt) {
                int count = getLessThan(name.charAt(index));
                change += count;
                result = replaceChar(result, index, nameAt);
            }

            index += getIndexParam(name, result, index);
            if(index < 0) {
                index = name.length() - 1;
            }
        } while(!name.equals(result));

        return change + move;
    }

    private int getLessThan(char character) {
        int a_abs = Math.abs(A_MIN - Character.getNumericValue(character));
        int z_abs = Math.abs(Z_MAX - Character.getNumericValue(character)) + 1;

        if(a_abs < z_abs) {
            return a_abs;
        }

        return z_abs;
    }

    private String replaceChar(String result, int index, char character) {
        String newResult = "";

        char[] chars = result.toCharArray();
        chars[index] = character;
        for(char x : chars) {
            newResult += x;
        }

        return newResult;
    }

    private int getIndexParam(String name, String result, int index) {
        int min = name.length();
        int max = 0;
        boolean hasFoundMin = false;

        for(int i=0; i<name.length(); i++) {
            char nameAt = name.charAt(i);
            char resultAt = result.charAt(i);

            if(nameAt != resultAt && nameAt != 'A' && !hasFoundMin) {
                min = i;
                hasFoundMin = true;
            }

            if(nameAt != resultAt && nameAt != 'A') {
                max = i;
            }
        }

        if(index > max) {
            if(name.length() - index + min <= index - max) {
                return 1;
            }

            return -1;
        }

        if(min - index <= name.length() - max + index) {
            return 1;
        }

        return -1;
    }
}
