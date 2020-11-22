package BOJ_4344.src;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        for (int i = 0; i < C; i++) {
            int N = scan.nextInt();
            int[] scores = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                scores[j] = scan.nextInt();
                sum += scores[j];
            }
            double avg = (double)sum / N;
            int count = 0;
            for (int score : scores) {
                if (score > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (double)count/N*100);
        }
    }
}