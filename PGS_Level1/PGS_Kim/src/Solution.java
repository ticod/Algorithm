package PGS_Kim.src;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String solution(String[] seoul) {
        return IntStream.range(0, seoul.length)
                .filter(i -> seoul[i].equals("Kim"))
                .mapToObj(i -> "김서방은 " + i + "에 있다")
                .findAny().get();
    }
}

/* ArrayList의 indexOf 풀이 */
class SolutionList {
    public String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index + "에 있다"
    }
}