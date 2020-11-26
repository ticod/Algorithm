package b1018;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();

    private static final char[][] wbBox = {
            {'W', 'B'},
            {'B', 'W'}
    };

    private static final char[][] bwBox = {
            {'B', 'W'},
            {'W', 'B'}
    };

    public static void main(String[] args) throws IOException {
        // CODE
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String[] rows = new String[N];
        for (int i = 0; i < N; i++) {
            rows[i] = sc.nextLine();
        }

        int minDiff = 64;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {

                int wbDiff = 0;
                int bwDiff = 0;

                for (int n = 0; n < 8; n++) {
                    for (int m = 0; m < 8; m++) {
                        char target = rows[i + n].charAt(j + m);
                        if (wbBox[n % 2][m % 2] != target) {
                            wbDiff++;
                        }
                        if (bwBox[n % 2][m % 2] != target) {
                            bwDiff++;
                        }
                    }
                }

                if (minDiff > wbDiff) {
                    minDiff = wbDiff;
                }
                if (minDiff > bwDiff) {
                    minDiff = bwDiff;
                }
            }
        }

        System.out.println(minDiff);
    }
}