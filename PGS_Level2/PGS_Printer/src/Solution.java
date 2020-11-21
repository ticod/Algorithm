import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Printer> priorityQ = new PriorityQueue<>();
        Queue<Printer> normalQ = new LinkedList<>();
        int document = 0;

        for (int priority : priorities) {
            normalQ.offer(new Printer(document, priority));
            priorityQ.offer(new Printer(document++, priority));
        }

        while (true) {
            answer++;
            Printer printer = normalQ.poll();
            if (priorityQ.peek().getPriority() > printer.getPriority()) {
                normalQ.add(printer);
                answer--;
                continue;
            } else {
                priorityQ.poll();
            }
            if (printer.getDocument() == location) {
                break;
            }
        }

        return answer;
    }
}

class Printer implements Comparable<Printer> {

    private final int document;
    private final int priority;

    Printer(int document, int priority) {
        this.document = document;
        this.priority = priority;
    }

    public int getDocument() {
        return document;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Printer p) {
        return p.priority - this.priority;
    }
}

//class Solution {
//    public int solution(int[] priorities, int location) {
//        int answer = 0;
//        Queue<Integer> normalQ = new LinkedList<>();
//        int document = 0;
//        int index = priorities.length - 1;
//
//        for (int priority : priorities) {
//            normalQ.offer(priority);
//        }
//
//        Arrays.sort(priorities);
//
//        while (!normalQ.isEmpty()) {
//            Integer i = normalQ.poll();
//            if (priorities[index - answer] > i) {
//                normalQ.offer(i);
//                location = (location - 1 < 0) ? normalQ.size() - 1 : location - 1;
//            } else {
//                answer++;
//                location--;
//                if (location < 0) {
//                    break;
//                }
//            }
//        }
//
//        return answer;
//    }
//}
