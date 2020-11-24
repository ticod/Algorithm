package b11729;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringBuilder sb = new StringBuilder();

    private static void solution(int from, int by, int to, int n) throws IOException {
        if (n == 1) {
            sb.append(from).append(' ').append(to).append('\n');
            return;
        }
        solution(from, to, by, n - 1);
        sb.append(from).append(' ').append(to).append('\n');
        solution(by, from, to, n - 1);
    }

    public static void main(String[] args) throws IOException {
        int N = sc.nextInt();
        System.out.println((1 << N) - 1);
        solution(1, 2, 3, N);
        bw.write(sb.toString());
        bw.flush();
    }
}