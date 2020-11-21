import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        final int supoja = 3;

        int[] firstSupoja = {1, 2, 3, 4, 5};
        int[] secondSupoja = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdSupoja = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> answer = new ArrayList<>();
        int[] score = new int[supoja];

        int maxScore = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == (i % 5) + 1) {
                score[0]++;
            }
            if (answers[i] == secondSupoja[i % secondSupoja.length]) {
                score[1]++;
            }
            if (answers[i] == thirdSupoja[i % thirdSupoja.length]) {
                score[2]++;
            }
        }

        for (int i : score) {
            maxScore = Math.max(maxScore, i);
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        int[] answerArray = new int[answer.size()];
        int index = 0;
        for (int i : answer) {
            answerArray[index++] = i;
        }

        return answerArray;
    }
}