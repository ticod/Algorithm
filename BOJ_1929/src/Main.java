import java.util.Scanner;

public class Main {

    private static boolean[] primeStorage = new boolean[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        initPrimeStorage();

        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int i = M; i <= N; i++) {
            if (!primeStorage[i]) {
                System.out.println(i);
            }
        }
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