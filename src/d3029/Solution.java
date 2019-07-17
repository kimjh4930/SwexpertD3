package d3029;

import java.util.Scanner;

public class Solution {
	
	static int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int m = scan.nextInt();
			int d = scan.nextInt();
			int day;
			
			int days = 0;
			
			for(int i=0; i<m-1; i++) {
				days += month[i];
			}
			days += d;
			
			day = (days + 3) % 7;
			
			System.out.println("#" + test_case + " " + day);
			
		}
		scan.close();
	}

}
