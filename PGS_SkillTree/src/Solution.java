import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] skillTrees = {"BACDE", "CBADF", "AECB", "BDA", "AQ"};
        System.out.println(new Solution().solution("CBD", skillTrees));
    }
}

class Solution {
    public int solution(String skill, String[] skillTrees) {
        int answer = 0;
        int skillIndex = 0;
        Set<Character> skillCharacters = new HashSet<>();

        for (int i = 0; i < skill.length(); i++) {
            skillCharacters.add(skill.charAt(i));
        }

        for (String skillTree : skillTrees) {
            boolean isRightSkill = true;
            for (char ch : skillTree.toCharArray()) {
                if (skillCharacters.contains(ch) &&
                        skill.charAt(skillIndex++) != ch) {
                    isRightSkill = false;
                    break;
                }
            }
            if (isRightSkill) {
                answer++;
            }
            skillIndex = 0;
        }

        return answer;
    }
}

/* 정규식 풀이 */
class SolutionRegex {
    public int solution(String skill, String[] skillTrees) {
        return (int) Arrays.stream(skillTrees)
                .map(s -> s.replaceAll("[^" + skill + "]*", ""))
                .filter(skill::startsWith)
                .count();
    }
}