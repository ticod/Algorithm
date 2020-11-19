import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int idx = 0;
        Arrays.sort(d);

        while (idx < d.length) {
            if (budget - d[idx] < 0) break;
            budget -= d[idx++];
        }

        return idx;
    }
}