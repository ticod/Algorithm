package chuseokTraffic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{
                "2016-09-15 20:59:57.421 0.351s",
                "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s",
                "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s",
                "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s",
                "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s",
                "2016-09-15 21:00:02.066 2.62s"
        }));
        System.out.println(new Solution().solution(new String[]{
                "2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"
        }));
    }
}

class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        List<Traffic> trafficList = new ArrayList<>();

        // init
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        for (String line : lines) {
            long diff = (long) (Double.parseDouble(
                    line.substring(line.lastIndexOf(' ') + 1, line.length() - 1)) * 1000) - 1;
            try {
                long start = sf.parse(line).getTime() - diff;
                long end = sf.parse(line).getTime();
                trafficList.add(new Traffic(start, end));
            } catch (ParseException e) {}
        }

        // process
        for (Traffic trafficSection : trafficList) {
            answer = Math.max(answer, sectionCalc(trafficList, trafficSection.getStart()));
            answer = Math.max(answer, sectionCalc(trafficList, trafficSection.getEnd()));
        }

        return answer;
    }

    private static int sectionCalc(List<Traffic> trafficList, long sectionStart) {
        long sectionEnd = sectionStart + 1000;
        int throughput = 0;
        for (Traffic traffic : trafficList) {
            if (sectionEnd + 3000 <= traffic.getEnd()) {
                break;
            }
            if ((traffic.getStart() <= sectionStart && sectionStart <= traffic.getEnd())
                    || (sectionStart <= traffic.getStart() && traffic.getStart() < sectionEnd)) {
                throughput++;
            }
        }
        return throughput;
    }

    static class Traffic {
        private final long start;
        private final long end;

        Traffic(long start, long end) {
            this.start = start;
            this.end = end;
        }

        public long getStart() {
            return start;
        }

        public long getEnd() {
            return end;
        }
    }
}