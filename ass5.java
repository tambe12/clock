package sync;

import java.util.Scanner;

public class clocksync {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();

        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter time for node " + i + ": ");
            time[i] = scanner.nextInt();
        }

        int master = 0;

        System.out.println("\nNode 0 is Master Node");

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += time[i];
        }

        int avg = sum / n;

        System.out.println("\nAverage Time: " + avg);

        System.out.println("\nAdjusted Times:");

        for (int i = 0; i < n; i++) {

            int adjustment = avg - time[i];

            System.out.println(
                "Node " + i +
                " Adjustment = " + adjustment +
                " New Time = " + (time[i] + adjustment)
            );
        }

        scanner.close();
    }
}
