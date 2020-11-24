package BOJ_1085.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int distance = x;
        distance = (distance < y) ? distance : y;
        distance = (distance < w - x) ? distance : w - x;
        distance = (distance < h - y) ? distance : h - y;
        System.out.println(distance);
    }
}