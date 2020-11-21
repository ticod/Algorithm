import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test = 0; test < T; test++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            System.out.println((((N - 1) % H) + 1) * 100 + ((N - 1) / H + 1));
        }
    }
}