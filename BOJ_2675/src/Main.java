import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int R = scan.nextInt();
            char[] S = scan.next().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : S) {
                for (int k = 0; k < R; k++) {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}