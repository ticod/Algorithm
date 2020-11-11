import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        int[] abd = new Solution().solution("TOBEORNOTTOBEORTOBEORNOT");

        for (int i : abd) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] solution(String msg) {
        final int ALPHABET = 26; // 알파벳 갯수

        List<Integer> answer = new ArrayList<>(); // 답안 (검색된 색인 번호 저장)

        Map<String, Integer> dictionary = new HashMap<>(); // 사전
        int index = ALPHABET + 1; // 사전 인덱스 시작 번호

        StringBuilder sb = new StringBuilder(msg); // 전체 문자열 저장
        StringBuilder target = new StringBuilder(); // 탐색 문자열 저장
        int targetSize = 0; // 탐색 문자열 길이 저장 (append 메서드 사용)
        
        // 사전 초기화
        for (int i = 0; i < ALPHABET; i++) {
            dictionary.put(Character.toString(i + 'A'), i + 1);
        }
        
        // 처리
        do {
            target.append(sb.charAt(targetSize++));
            if (!dictionary.containsKey(target.toString())) {
                dictionary.put(target.toString(), index++);
                answer.add(dictionary.get(target.deleteCharAt(targetSize - 1).toString()));
                sb.delete(0, target.length());
                target = new StringBuilder();
                targetSize = 0;
            }
        } while (targetSize != sb.length());
        answer.add(dictionary.get(target.toString()));

        // List => Array
        int[] result = new int[answer.size()];
        int i = 0;
        for (int n : answer) {
            result[i++] = n;
        }
        
        return result;
    }
}