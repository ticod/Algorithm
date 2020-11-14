import java.util.Scanner;

public class Main {

    private static boolean[] primeStorage = new boolean[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        initPrimeStorage();

        int primeSum = 0;
        int minPrime = 0;
        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int i = N; i >= M; i--) {
            if (!primeStorage[i]) {
                minPrime = i;
                primeSum += i;
            }
        }

        if (primeSum == 0) {
            System.out.println("-1");
            return;
        }

        System.out.println(primeSum);
        System.out.println(minPrime);
    }

    private static void initPrimeStorage() {
        primeStorage[1] = true;
        for (int i = 2; i * i < primeStorage.length; i++) {
            if (!primeStorage[i]) {
                for (int j = i * i; j < primeStorage.length; j += i) {
                    primeStorage[j] = true;
                }
            }
        }
    }
}