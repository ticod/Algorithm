package b1436;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // CODE
        int N = sc.nextInt();

        int result = 665;
        while (N != 0) {
            result++;
            if (isRight(result)) {
                N--;
            }
        }

        System.out.println(result);
    }

    private static boolean isRight(int num) {
        return String.valueOf(num).contains("666");
    }
}