import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine(); // flush
        char[] num = scan.nextLine().toCharArray();
        int sum = 0;
        for (char ch : num) {
            sum += (ch - '0');
        }
        System.out.println(sum);
    }
}