import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String part : participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }

        for (String comp : completion) {
            map.put(comp, map.get(comp) - 1);
            if (map.get(comp) == 0) {
                map.remove(comp);
            }
        }

        answer = map.keySet().toString().replaceAll("\\W", "");
        return answer;
    }
}