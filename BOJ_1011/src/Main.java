/* https://www.acmicpc.net/problem/1011 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] x = new int[T];
        int[] y = new int[T];
        for (int i = 0; i < T; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        for (int i = 0; i < T; i++) {
            long d = y[i] - x[i];
            System.out.println(getTimes(d));
        }
        scanner.close();
    }

    public static long getStep(long d) {
        long i = 1;
        for (; i * (i + 1) < d; i++);
        return i;
    }

    public static long getTimes(long d) {
        long s = getStep(d);
        return (d <= s * s) ? (2 * s - 1) : (2 * s);
    }
}
