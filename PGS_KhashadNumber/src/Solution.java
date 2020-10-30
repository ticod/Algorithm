import java.util.*;

class Solution {
    public static boolean solution(int x) {
//        return x % (x + "").chars().map(c -> c - '0').sum() == 0;
        int temp = x, sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return temp % sum == 0;
    }
}