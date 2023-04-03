package kr.soc.programmers;

import java.util.*;

public class Lessons42839 {
    public int solution(String numbers) {
        TreeSet<Integer> numberSet = new TreeSet<>();
        char[] numberChars = numbers.toCharArray();

        for(int a=0; a<numberChars.length; a++) {
            String as = String.valueOf(numberChars[a]);
            numberSet.add(Integer.parseInt(as));

            for(int b=0; b<numberChars.length; b++) {
                if(a == b) { continue; }
                String bs = as + numberChars[b];
                numberSet.add(Integer.parseInt(removeFrontZero(bs)));

                for(int c=0; c<numberChars.length; c++) {
                    if(c == a || c == b) { continue; }
                    String cs = bs + numberChars[c];
                    numberSet.add(Integer.parseInt(removeFrontZero(cs)));

                    for(int d=0; d<numberChars.length; d++) {
                        if(d == a || d == b || d == c) { continue; }
                        String ds = cs + numberChars[d];
                        numberSet.add(Integer.parseInt(removeFrontZero(ds)));

                        for(int e=0; e<numberChars.length; e++) {
                            if(e == a || e == b || e == c || e == d) { continue; }
                            String es = ds + numberChars[e];
                            numberSet.add(Integer.parseInt(removeFrontZero(es)));

                            for(int f=0; f<numberChars.length; f++) {
                                if(f == a || f == b || f == c || f == d || f == e) { continue; }
                                String fs = es + numberChars[f];
                                numberSet.add(Integer.parseInt(removeFrontZero(fs)));

                                for(int g=0; g<numberChars.length; g++) {
                                    if(g == a || g == b || g == c || g == d || g == e || g == f) { continue; }
                                    String gs = fs + numberChars[g];
                                    numberSet.add(Integer.parseInt(removeFrontZero(gs)));
                                }
                            }
                        }
                    }
                }
            }
        }

        int cnt = 0;
        for(Integer x : numberSet) {
            if(isPrimeNumber(x)) {
                cnt++;
            }
        }

        return cnt;
    }

    public String removeFrontZero(String number) {
        if(number.length() <= 0) {
            return "0";
        }

        char first = number.charAt(0);
        if(first == '0') {
            number = removeFrontZero(number.substring(1));
        }

        return number;
    }

    public boolean isPrimeNumber(int number) {
        if(number == 0 || number == 1) {
            return false;
        }

        for(int i=2; i<number; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
