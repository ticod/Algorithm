import java.util.Scanner;

public class Main {

    final private static boolean[] prime = new boolean[10000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        initPrime();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            for (int j = 0; j <= n / 2; j++) {
                if (!prime[n / 2 + j] && !prime[n / 2 - j]) {
                    System.out.println((n / 2 - j) + " " + (n / 2 + j));
                    break;
                }
            }
        }

        sc.close();
    }

    private static void initPrime() {
        prime[1] = true;
        for (int i = 2; i * i < prime.length; i++) {
            if (!prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = true; // false is prime
                }
            }
        }
    }
}