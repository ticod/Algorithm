import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            String word = scanner.next();
            Set<Character> set = new HashSet<>();
            char preCh = 0;
            boolean flag = false;
            for (char ch : word.toCharArray()) {
                if (preCh == ch) {
                    continue;
                } else {
                    preCh = ch;
                    if (!set.add(ch)) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}