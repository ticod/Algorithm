/* https://programmers.co.kr/learn/courses/30/lessons/42862 */
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                //if(reserve[j] == -1) continue;
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for(int l : lost){
            if(l == -1) continue;
            for(int i = 0; i < reserve.length; i++){
                if(reserve[i] == -1) continue;
                if(l-1 == reserve[i]){
                    answer++;
                    reserve[i] = -1;
                    break;
                }
                else if(l+1 == reserve[i]){
                    answer++;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
