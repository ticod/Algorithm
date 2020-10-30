import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < N; i++) {
            char[] ox = scan.nextLine().toCharArray();
            int score = 1, total = 0;
            for (char c : ox) {
                if (c == 'O') {
                    total += score++;
                } else {
                    score = 1;
                }
            }
            System.out.println(total);
        }
    }
}