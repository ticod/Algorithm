import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            count += (isHansu(i)) ? 1 : 0;
        }

        System.out.println(count);
    }

    public static boolean isHansu(int num) {
        if (num < 100) {
            return true;
        }

        int[] array = new int[20];
        int index = 0;

        while (num > 0) {
            array[index++] = num % 10;
            num /= 10;
        }

        int diff = array[0] - array[1];
        for (int i = 1; i < index - 1; i++) {
            if (diff != array[i] - array[i+1]) {
                return false;
            }
        }
        return true;
    }
}
