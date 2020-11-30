import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> progressCounts = new ArrayList<>();
        int progressIndex = 0;

        int day = 1;
        while (progressIndex < progresses.length) {
            for (int i = progressIndex; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }

            if (progresses[progressIndex] >= 100) {
                int count = 0;
                while (progressIndex < progresses.length
                        && progresses[progressIndex] >= 100) {
                    progressIndex++;
                    count++;
                }
                progressCounts.add(count);
            }
        }

        return listToArray(progressCounts);
    }

    private static int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        int idx = 0;
        for (int i : list) {
            result[idx++] = i;
        }

        return result;
    }
}