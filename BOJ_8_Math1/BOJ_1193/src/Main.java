import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int idx = 1;
        int sum = 0;
        for(; idx + sum < X; idx++) {
            sum += idx;
        }
        int diff = X - sum - 1;
        if ((idx & 1) == 1) {
            System.out.println((idx - diff) + "/" + (1 + diff));
        } else {
            System.out.println((1 + diff) + "/" + (idx - diff));
        }
    }
}