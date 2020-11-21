import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
//        String[] a = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] a = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        String[] s = new Solution().solution(a);
        for (String v : s) {
            System.out.print(v + " ");
        }
    }
}

class Solution {
    final static String regex = "(\\D*)([0-9]*)(.*)";
    final static Pattern pattern = Pattern.compile(regex);

    private static int compare(String s1, String s2) {
        Matcher matcher = pattern.matcher(s1);
        String S1_HEAD = null;
        String S1_BODY = null;
        String S1_TAIL = null;
        String S2_HEAD = null;
        String S2_BODY = null;
        String S2_TAIL = null;

        if (matcher.matches()) {
            S1_HEAD = matcher.group(1).toLowerCase();
            S1_BODY = matcher.group(2);
            S1_TAIL = matcher.group(3).toLowerCase();
        }
        matcher = pattern.matcher(s2);
        if (matcher.matches()) {
            S2_HEAD = matcher.group(1).toLowerCase();
            S2_BODY = matcher.group(2);
            S2_TAIL = matcher.group(3).toLowerCase();
        }

        System.out.println(S1_HEAD);
        System.out.println(S2_HEAD);
        System.out.println(S1_BODY);
        System.out.println(S2_BODY);

        int headDiff = S1_HEAD.compareTo(S2_HEAD);
        if (headDiff == 0) {
            int bodyDiff = Integer.parseInt(S1_BODY) - Integer.parseInt(S2_BODY);
            return (bodyDiff == 0) ? 0 : bodyDiff;
        } else {
            return headDiff;
        }
    }

    public String[] solution(String[] files) {
        Arrays.sort(files, Solution::compare);
        return files;
    }
}