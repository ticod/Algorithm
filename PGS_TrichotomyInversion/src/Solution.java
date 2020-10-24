/* https://programmers.co.kr/learn/courses/30/lessons/68935 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n%3);
            n/=3;
        }
        int squaredCount = 1;
        for (int i = sb.length() - 1; i >= 0; i--) {
            answer += (sb.charAt(i) - '0') * squaredCount;
            squaredCount *= 3;
        }
        return answer;
    }
}
