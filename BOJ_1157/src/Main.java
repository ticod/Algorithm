import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int[] alphabetCount = new int['Z' - 'A' + 1]; // 26

        word = word.toUpperCase();
        for (char ch : word.toCharArray()) {
            alphabetCount[ch - 'A']++;
        }

        int max = 0, index = 0;
        boolean check = false;
        for (int i = 0; i < alphabetCount.length; i++) {
            if (alphabetCount[i] > max) {
                max = alphabetCount[i];
                index = i;
                check = false;
            } else if (alphabetCount[i] == max) {
                check = true;
            }
        }

        System.out.println((check) ? "?" : (char)(index + 'A'));
    }
}