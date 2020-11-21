import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(solution(N));
    }
    public static int solution(int N) {
        for (int i = N / 5; i >= 0; i--) {
            if ((N - 5 * i) % 3 == 0) {
                return i + (N - 5 * i) / 3;
            }
        }
        return -1;
    }
}
