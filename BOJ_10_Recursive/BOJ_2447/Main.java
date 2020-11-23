package BOJ_2447;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    private static char[][] star = new char[6562][6562];

    private static char[][] pattern = {
            {'*', '*', '*'},
            {'*', ' ', '*'},
            {'*', '*', '*'}
    };

    private static void init(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = ' ';
            }
        }
    }

    private static void printStar(int n, BufferedWriter bw) throws IOException {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(star[i][j]);
            }
            bw.write('\n');
        }
        bw.write(star[n - 1], 0, n);
        bw.flush();
    }

    private static void solution(int x, int y, int n) {

        if (n == 3) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    star[i + y][j + x] = pattern[i][j];
                }
            }
            return;
        }

        n /= 3;
        // 윗 줄
        solution(x, y, n);
        solution(x + n, y, n);
        solution(x + (2 * n), y, n);
        // 가운데 줄
        solution(x, y + n, n);
        solution(x + (2 * n), y + n, n);
        // 아래 줄
        solution(x, y + (2 * n), n);
        solution(x + n, y + (2 * n), n);
        solution(x + (2 * n), y + (2 * n), n);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        init(n);
        solution(0, 0, n);
        printStar(n, bw);
    }
}