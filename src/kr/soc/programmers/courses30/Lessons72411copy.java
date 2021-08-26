package kr.soc.programmers.courses30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Lessons72411copy {
    static HashMap<String,Integer> map;
    static int m;

    public String[] solution(String[] orders, int[] course) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int value : course) {
            map = new HashMap<>();
            m = 0;
            for (String order : orders) {
                find(0, "", value, 0, order);
            }
            for (String s : map.keySet()) {
                if (map.get(s) == m && m > 1) {
                    pq.offer(s);
                }
            }
        }

        String[] ans = new String[pq.size()];
        int k = 0;
        while (!pq.isEmpty()){
            ans[k++] = pq.poll();
        }
        return ans;
    }

    static void find(int cnt, String str, int targetNum, int idx, String word){
        if (cnt == targetNum){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            StringBuilder temps = new StringBuilder();
            for (char value : c) {
                temps.append(value);
            }
            map.put(temps.toString(), map.getOrDefault(temps.toString(),0) + 1);
            m = Math.max(m, map.get(temps.toString()));
            return;
        }

        for (int i=idx; i<word.length(); i++){
            char now = word.charAt(i);
            find(cnt + 1,str + now, targetNum,i + 1, word);
        }
    }

    /*
      저도 해당 부분에서 한번 미끄러졌습니다.
      기본적으로 조합은 고등학교때 배운 공식에 따르면 C(n, r) = n! / ((n-r)! * r!) 입니다.
      여기서 alphas가 한 26종류정도 된다고 하고 그중 10개를 뽑는다면, 계산을 대충 때려보면 조합의 개수는 5,311,735개 입니다.
      여기서 계산에 문제가 생길 것임을 예상 가능합니다.

      이 문제를 회피하기 위해서는 combination개수를 줄이면 됩니다.
      만약 ['ABCDEFGHIJKLMN', 'OPQRSTUVWXYZ']라는 사례가 있다면 combination(alphas, 10)로 계산하면 경우의 수가 5,311,735개 이지만
      이 조합중 'AO', 'AP', ...같이 두 주문간 메뉴를 섞는 경우의 수는 0회임을 예상 가능합니다.

      따라서 set(combination('ABCDEFGHIJKLMN', 10)) | set(combination('OPQRSTUVWXYZ', 10)) 이런식으로 두 조합을 만든 후 합치면 많은 경우의 수를 줄일 수 있습니다.
      위 사례는 combination('ABCDEFGHIJKLMN', 10) = C(14, 10) = 1001개, combination('OPQRSTUVWXYZ', 10) = C(12, 10) = 66개로 두 조합간에 중복이 없다고 쳐도 1067번의 비교만으로 정답이 나올 것임을 예상 가능합니다.

      즉 위 사례에서는 비교 횟수가 5,311,735회에서 1067회로 줄어듭니다.
      아마 해당 13, 14, 15 테스트케이스는 이런 극단적인 경우의 수를 확인하는 코드로 생각됩니다.
     */
}
