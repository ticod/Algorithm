package PGS_LargestNumber;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String result1 = new Solution().solution(new int[]{3, 30, 34, 5, 9});
        String result2 = new Solution().solution(new int[]{6, 10, 2});
        System.out.println(result1);
        System.out.println(result2);
    }
}

class Solution {
    public String solution(int[] numbers) {
        
        // boxing
        Integer[] numbersTemp = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersTemp[i] = numbers[i];
        }

        // sort
        Arrays.sort(numbersTemp, Solution::compare);

        // toString
        StringBuilder answer = new StringBuilder();
        if (numbersTemp[0] == 0) {
            answer.append("0");
        } else {
            for (Integer target : numbersTemp) {
                answer.append(target);
            }
        }

        return answer.toString();
    }

    private static int compare(int i1, int i2) {
        String s1 = String.valueOf(i1) + String.valueOf(i2);
        String s2 = String.valueOf(i2) + String.valueOf(i1);
        return s2.compareTo(s1);
    }
}