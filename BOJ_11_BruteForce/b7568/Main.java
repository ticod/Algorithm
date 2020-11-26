package b7568;

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
        int[][] people = new int[N][2];
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank[i]++;
                }
            }
            System.out.print(++rank[i] + " ");
        }
    }
}