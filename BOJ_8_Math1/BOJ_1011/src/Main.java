/* https://www.acmicpc.net/problem/1011 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            long d = y - x;
            System.out.println(getTimes(d));
        }
        sc.close();
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
