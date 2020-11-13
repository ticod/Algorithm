import java.util.Stack;

class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 4, 2, 1));
    }
}

class Solution {
    public static String[] hex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int gameNumber = -1;
        int gameCount = 0;

        while (true) {
            if (answer.length() == t) {
                break;
            }
            if (stack.isEmpty()) {
                gameNumber++;
                int temp = gameNumber;
                System.out.println(gameNumber);
                do {
                    stack.push(hex[temp % n]);
                    temp /= n;
                } while (temp > 0);
            } else {
                String currentNumber = stack.pop();
                if (gameCount % m == p - 1) {
                    answer.append(currentNumber);
                }
                gameCount++;
            }
        }

        return answer.toString();
    }
}