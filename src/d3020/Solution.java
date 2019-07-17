package d3020;

import java.util.Scanner;

public class Solution {
	
	static int[] stopArray = new int[5001];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int buses = scan.nextInt();
			int max = -1;
			
			for(int i=0; i<buses; i++) {
				int start = scan.nextInt();
				int end = scan.nextInt();
				
				if(end > max) {
					max = end;
				}
				
				for(int j=start; j<=end; j++) {
					stopArray[j]++;
				}
			}
			
			int stops = scan.nextInt();
			
			System.out.print("#" + test_case + " ");
			
			for(int i=0; i<stops; i++) {
				int stop = scan.nextInt();
				System.out.print(stopArray[stop] + " ");
			}
			System.out.println("");
			
			for(int i=0; i<max; i++) {
				stopArray[i] = 0;
			}
			
		}
		scan.close();
	}

}
