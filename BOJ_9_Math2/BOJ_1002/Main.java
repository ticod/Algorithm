package BOJ_1002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt(),
                    x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();
            int dPow = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            int rPlus = r1 + r2;
            int rMinus = r1 - r2;
            int rPowPlus = rPlus * rPlus;
            int rPowMinus = rMinus * rMinus;

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println("-1");
            } else if (rPowPlus < dPow || rPowMinus > dPow) {
                System.out.println("0");
            } else if (rPowPlus == dPow || rPowMinus == dPow) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }
}