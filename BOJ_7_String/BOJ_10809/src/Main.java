import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char[] charArray = S.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char i = 'a'; i <= 'z'; i++) {
            boolean find = false;
            for (int j = 0; j < S.length(); j++) {
                if (charArray[j] == i) {
                    sb.append(j);
                    sb.append(" ");
                    find = true;
                    break;
                }
            }
            if (!find) {
                sb.append(-1);
                sb.append(" ");
            }
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}