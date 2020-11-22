package BOJ_2577.src;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        long result = A * B * C;
        int[] arr = new int[10];

        while (result > 0) {
            arr[(int)(result%10)]++;
            result /= 10;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}