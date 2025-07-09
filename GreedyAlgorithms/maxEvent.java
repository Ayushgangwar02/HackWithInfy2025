package GreedyAlgorithms;

import java.util.*;

public class maxEvent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of events: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No events to attend.");
            sc.close();
            return;
        }

        int[][] events = new int[n][2];

        System.out.println("Enter events (start_day end_day):");
        for (int i = 0; i < n; i++) {
            events[i][0] = sc.nextInt(); 
            events[i][1] = sc.nextInt(); 
        }

        int result = maxEvents(events);
        System.out.println("Maximum events you can attend: " + result);
        sc.close();
    }

    public static int maxEvents(int[][] events) {
        if (events == null || events.length == 0) {
            return 0;
        }

    
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0, n = events.length;
        int eventCount = 0;

        
        int maxDay = Arrays.stream(events).mapToInt(e -> e[1]).max().getAsInt();


        int startDay = Arrays.stream(events).mapToInt(e -> e[0]).min().getAsInt();

        
        for (int day = startDay; day <= maxDay; day++) {
            
            while (i < n && events[i][0] <= day) {
                pq.offer(events[i][1]); 
                i++;
            }

            
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            
            if (!pq.isEmpty()) {
                pq.poll(); 
                eventCount++;
            }
        }

        return eventCount;
    }
}
