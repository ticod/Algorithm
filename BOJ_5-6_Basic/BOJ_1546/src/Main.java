import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] M = new int[N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            M[i] = scan.nextInt();
            max = Math.max(M[i], max);
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (double)M[i] / max * 100;
        }
        System.out.println(sum / N);
    }
}