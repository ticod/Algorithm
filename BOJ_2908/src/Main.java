import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(Math.max(reverseInt(A), reverseInt(B)));
    }

    private static int reverseInt(int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        return Integer.parseInt(sb.reverse().toString());
        // 직접 구현?
//        char[] arr = Integer.toString(num).toCharArray();
//
//        for (int i = 0; i < arr.length / 2; i++) {
//            char temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }
//
//        return Integer.parseInt(new String(arr));
    }
}