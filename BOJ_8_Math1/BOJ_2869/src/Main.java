import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();
        System.out.println((int)Math.ceil(((double)V - A) / (A - B)) + 1);
    }
}