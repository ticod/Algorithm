import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];

        while (true) {
            boolean isZero = true;
            for (int i = 0; i < 3; i++) {
                num[i] = sc.nextInt();
                if (num[i] != 0) {
                    isZero = false;
                }
            }
            if (isZero) return;
            System.out.println((isRightTriangle(num) ? "right" : "wrong"));
        }
    }

    private static boolean isRightTriangle(int[] numbers) {
        return numbers.length == 3 && isRightTriangle(numbers[0], numbers[1], numbers[2]);
    }

    private static boolean isRightTriangle(int n1, int n2, int n3) {
        return (n1 * n1 == n2 * n2 + n3 * n3) ||
                (n2 * n2 == n1 * n1 + n3 * n3) ||
                (n3 * n3 == n1 * n1 + n2 * n2);
    }
}