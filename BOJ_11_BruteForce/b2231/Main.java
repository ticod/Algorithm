package b2231;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // CODE
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (sum(i) == N) {
                bw.write(String.valueOf(i));
                bw.flush();
                return;
            }
        }
        bw.write(String.valueOf(0));
        bw.flush();
    }

    private static int sum(int n) {
        int sum = 0;
        int i = n;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum + n;
    }
}