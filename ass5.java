package ds_5;


import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class ass5 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of nodes ");
		int n = scanner.nextInt();
		
		int [] time = new int[n];
		
		for(int i = 0; i< n; i++) {
			System.out.println("Enter time for node : "+ i);
			time[i] = scanner.nextInt();
		}
		
		int master = 0;
		
		System.out.println("Node 0 is master");
		
		int diff[] = new int[n];
		
		int sum = 0;
		
		for(int i = 0; i< n; i++) {
			diff[i] = time[i] - time[master];
			sum+= time[i];
		}
		
		int avg = sum/n;
		
		System.out.println("Average afjsutments : " + avg);
		
		System.out.println("Adjusted times");
		
		for(int i = 0; i< n; i++) {
			time[i] = time[i] + (avg- diff[i]);
			System.out.println("Node "+ i +"New time : "+ time[i]);
		}
	}
}
