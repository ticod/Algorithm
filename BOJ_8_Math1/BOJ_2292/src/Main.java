import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = 1;
        for (i = 1; 6 * (i * (i - 1) / 2) + 1 < N; i++) {}
        System.out.println(i);
    }
}