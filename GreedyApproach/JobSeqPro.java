package GreedyApproach;

import java.util.*;

class Job {
    String id;
    int profit, deadlines;

    Job(String i, int p, int d) {
        id = i;
        profit = p;
        deadlines = d;
    }
}

public class JobSeqPro {
    public static void main(String args[]) {
        Job[] jobs = {
                new Job("a", 100, 2),
                new Job("b", 19, 1),
                new Job("c", 27, 2),
                new Job("d", 25, 1),
                new Job("e", 15, 3)
        };

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxDeadlines = Arrays.stream(jobs).mapToInt(j -> j.deadlines).max().getAsInt();
        boolean[] slot = new boolean[maxDeadlines + 1];
        int totprofit = 0;

        for (Job job : jobs) {
            for (int i = job.deadlines - 1; i > 0; i--) {
                if (!slot[i]) {
                    slot[i] = true;
                    totprofit += job.profit;
                    break;
                }
            }
        }
        System.out.println("Total profit: " + totprofit);

    }
}
