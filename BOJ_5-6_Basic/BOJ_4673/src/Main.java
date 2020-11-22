package BOJ_4673.src;

import java.util.*;

public class Main {

    final static int MAX_NUMBER = 10000;
    static boolean[] dp = new boolean[MAX_NUMBER + 1];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < MAX_NUMBER; i++) {
            if (isSelfNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSelfNumber(int N) {
        if (getGeneratorNumber(N) < MAX_NUMBER) {
            dp[getGeneratorNumber(N)] = true;
        }
        return !dp[N];
    }

    public static int getGeneratorNumber(int N) {
        int answer = N;
        while (N > 0) {
            answer += N % 10;
            N /= 10;
        }
        return answer;
    }
}