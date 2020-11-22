package BOJ_10870;

import java.util.Scanner;

public class Main {

    private static int[] dp = new int[2];

    private static void fibo(int n) {
        if (n <= 1) {
            return;
        }
        fibo(n - 1);
        dp[n & 1] = dp[0] + dp[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dp[0] = 0;
        dp[1] = 1;
        int n = sc.nextInt();
        fibo(n);
        System.out.println(dp[n & 1]);
    }
}