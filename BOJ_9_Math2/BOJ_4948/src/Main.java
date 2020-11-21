import java.util.Scanner;

public class Main {

    private static boolean[] prime = new boolean[250000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        initPrime();

        while ((n = sc.nextInt()) != 0) {
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!prime[i]) count++;
            }
            System.out.println(count);
        }
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