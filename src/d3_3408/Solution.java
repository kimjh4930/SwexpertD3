package d3_3408;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			long n = scan.nextLong();
			
			long sum = (n * (n+1))/2;
			long oddSum = n*n;
			long evenSum = n*n + n;
			
			System.out.println("#" + test_case + " " + sum + " " + oddSum + " " + evenSum);
		}
		
		
		scan.close();
	}

}
