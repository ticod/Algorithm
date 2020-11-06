import java.util.Collections;
import java.util.List;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 100000).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000);
        }
        int[] arr2 = arr.clone();

        // array
        long time = System.currentTimeMillis();
        System.out.println(new Solution().solution(arr));
        System.out.println("Array  : " + (System.currentTimeMillis() - time) + "ms");

        // stream
        long time2 = System.currentTimeMillis();
        System.out.println(new SolutionStream().solution(arr2));
        System.out.println("Stream : " + (System.currentTimeMillis() - time2) + "ms");
    }
}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations.length - i <= citations[i]) {
                answer = citations.length - i;
                break;
            }
        }

        return answer;
    }
}

class SolutionStream {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        return citations.length - IntStream.range(0, citations.length)
                .filter(idx -> (citations.length - idx) <= citations[idx])
                .findFirst()
                .orElse(0);
    }
}
