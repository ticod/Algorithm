import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long A, B, C;
        A = scan.nextLong();
        B = scan.nextLong();
        C = scan.nextLong();
        if (B >= C) {
            System.out.println("-1");
            return ;
        }
        int count = 0;
        while (A + (B * count) >= C * count) {
            count++;
        }
        System.out.println(count);
    }
}
