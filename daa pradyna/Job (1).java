package DAA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Job {
    int id;
    int deadline;
    int profit;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSchedulingWithDeadlines {
    public static void jobScheduling(List<Job> jobs) {
        // Sort the jobs by their profits in descending order
        Collections.sort(jobs, Comparator.comparingInt((Job job) -> job.profit).reversed());

        // Find the maximum deadline among all jobs
        int maxDeadline = jobs.stream().mapToInt(job -> job.deadline).max().orElse(0);

        // Initialize an empty time slot array to keep track of scheduled jobs
        int[] timeSlots = new int[maxDeadline];

        // Initialize variables to keep track of total profit and the number of jobs scheduled
        int totalProfit = 0;
        int scheduledJobs = 0;

        // Schedule jobs
        for (Job job : jobs) {
            int deadline = job.deadline;

            // Find the next available time slot before or at the deadline
            while (deadline > 0 && timeSlots[deadline - 1] != 0) {
                deadline--;
            }

            // If a time slot is available, schedule the job
            if (deadline > 0) {
                timeSlots[deadline - 1] = job.id;
                totalProfit += job.profit;
                scheduledJobs++;
            }
        }

        System.out.println("Scheduled Jobs: " + scheduledJobs);
        System.out.println("Total Profit: " + totalProfit);
    }

    public static void main(String[] args) {
    	System.out.println("Name: Pradnya Sharad Kulkarni......................Roll Number: 20123071");
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job(1, 4, 20));
        jobs.add(new Job(2, 1, 10));
        jobs.add(new Job(3, 1, 40));
        jobs.add(new Job(4, 1, 30));

        jobScheduling(jobs);
    }
}
