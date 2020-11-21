import java.util.Scanner;

public class Main {

    private static int[][] dp = new int[15][15];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i <= 14; i++) {
            dp[0][i] = i;
            dp[i][1] = 1;
        }

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(solution(k, n));
        }
    }

    private static int solution(int k, int n) {
        if (dp[k][n] != 0) {
            return dp[k][n];
        }
        dp[k][n] = solution(k - 1, n) + solution(k, n - 1);
        return dp[k][n];
    }
}